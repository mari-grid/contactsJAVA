package contacts;

public class PersonFactory implements ContactInterface {

    @Override
    public Contact add() {
        Person person = new Person();
        System.out.println("Enter the name: ");
        String name = person.scan.nextLine();
        person.setName(name);
        System.out.println("Enter the surname: ");
        String surname = person.scan.nextLine();
        person.setSurname(surname);
        System.out.println("Enter the birth date: ");
        String birthDate = person.scan.nextLine();
        person.setBirthDate(birthDate);
        System.out.println("Enter the gender (M, F): ");
        String gender = person.scan.nextLine();
        person.setGender(gender);
        System.out.println("Enter the number: ");
        String number = person.scan.nextLine();
        person.setNumber(number);
        System.out.println("The record added. \n");
        return person;
    }
}
