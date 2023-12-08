package contacts;

public class OrganizationFactory implements ContactInterface{

    @Override
    public Contact add(){
        Organization organization = new Organization();
        System.out.println("Enter the organization name: ");
        String name = organization.scan.nextLine();
        organization.setName(name);
        System.out.println("Enter the address: ");
        String address = organization.scan.nextLine();
        organization.setAddress(address);
        System.out.println("Enter the number: ");
        String number = organization.scan.nextLine();
        organization.setNumber(number);
        System.out.println("The record added. \n");
        return organization;
    }
}
