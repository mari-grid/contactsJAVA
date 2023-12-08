package contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NumberFormatException {

        ContactStore contactStore = new ContactStore();
        OrganizationFactory orgFact = new OrganizationFactory();
        PersonFactory persFact = new PersonFactory();

        Scanner scan = new Scanner(System.in);

        ArrayList<Contact> contacts = new ArrayList<>();

        String command = "anyWord";

        System.out.println("open phonebook.db\n");

        while (!"exit".equals(command)) {
            System.out.println("[menu] Enter action (add, list, search, count, exit): ");
            command = scan.nextLine();

            if ("count".equals(command)) {
                System.out.println("The Phone Book has " +  contacts.size() + " records.");
            }

                while ("search".equals(command)) {
                    System.out.println("Enter search query: ");
                    String query = scan.nextLine();
                    ArrayList<Contact> results = new ArrayList<>();

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i) != null) {
                            if (contacts.get(i).isFound(query)) {
                                results.add(contacts.get(i));
                            }
                        }
                    }
                    System.out.println("Found " +  results.size() + " results:");
                    int n = 1;
                    for (Contact cont : results) {
                        System.out.println(n++ + ". " + cont.getInfo());
                    }

                    System.out.println("\n[search] Enter action ([number], back, again): ");
                    String searchCommand = scan.nextLine();
                    int index = -1;
                    try {
                        index = Integer.parseInt(searchCommand) - 1;
                    } catch (NumberFormatException e) {}
                    if ("again".equals(searchCommand)) {
                        command = "search";
                    } else if ("back".equals(searchCommand)) {
                        command = "back";
                        System.out.println("\n");
                    } else if (index >= 0 && index < results.size()) {
                        while (index >= 0 && index < results.size()) {
                            System.out.println(results.get(index).toString());
                            System.out.println("[record] Enter action (edit, delete, menu): ");
                            String recordCommand = scan.nextLine();
                            if ("edit".equals(recordCommand)) {
                                System.out.println(results.get(index).getEditableFields());
                                String field = scan.nextLine();
                                System.out.println("Enter " + field + ": ");
                                String newValue = scan.nextLine();
                                results.get(index).editField(field, newValue);
                            } else if ("delete".equals(recordCommand)) {
                                results.remove(index);
                                System.out.println("The record removed! \n");
                                index = results.size();
                                command = "menu";
                            } else if ("menu".equals(recordCommand)) {
                                command = "menu";
                                index = results.size();
                            }

                        }
                    } else if ("exit".equals(searchCommand)) {
                        command = "exit";
                        break;
                    }
                }

            if ("add".equals(command)) {
                System.out.println("Enter the type (person, organization): ");
                String type = scan.nextLine();
                contacts.add(contactStore.selectContact(type));
            }

            if ("list".equals(command)) {
                int n = 1;
                for (Contact cont : contacts) {
                    System.out.println(n++ + ". " + cont.getInfo());
                }
                System.out.println("\n [list] Enter action ([number], back): ");
                String listCommand = scan.nextLine();
                int index = -1;
                try {
                    index = Integer.parseInt(listCommand) - 1;
                } catch (NumberFormatException e) {}
                if ("back".equals(listCommand)) {
                    command = "back";
                    System.out.println("\n");
                } else if (index >= 0 && index < contacts.size()) {
                    while (index >= 0 && index < contacts.size()) {
                        System.out.println(contacts.get(index).toString());
                        System.out.println("[record] Enter action (edit, delete, menu): ");
                        String recordCommand = scan.nextLine();
                        if ("edit".equals(recordCommand)) {
                            System.out.println(contacts.get(index).getEditableFields());
                            String field = scan.nextLine();
                            System.out.println("Enter " + field + ": ");
                            String newValue = scan.nextLine();
                            contacts.get(index).editField(field, newValue);
                            //System.out.println(contacts.get(index).toString());
                        } else if ("delete".equals(recordCommand)) {
                            contacts.remove(index);
                            System.out.println("The record removed! \n");
                            index = contacts.size();
                            command = "menu";
                        } else if ("menu".equals(recordCommand)) {
                            command = "menu";
                            index = contacts.size();
                        }

                    }
                }
            }

            if ("exit".equals(command)) {
                break;
            }
        }
    }
}
