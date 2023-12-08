package contacts;

abstract class ContactFactory {

    abstract Contact selectContact(String type);

    Contact createContact(String type) {
        Contact contact = selectContact(type);
        return contact;
    }

}

class ContactStore extends ContactFactory {

    @Override
    Contact selectContact(String type) {
        if (type.equals("person")) {
            return new PersonFactory().add();
        } else if (type.equals("organization")) {
            return new OrganizationFactory().add();
        } else {
            return null;
        }
    }
}
