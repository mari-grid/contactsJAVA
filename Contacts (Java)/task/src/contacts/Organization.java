package contacts;

public class Organization extends Contact{
    private String address;

    public Organization() {
        super();
        init();
    }

    private void init() {
        this.address = "[no data]";
        this.isPerson = false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getEditableFields() {
        return "Select a field (name, address, number): ";
    }

    @Override
    public void editField(String field, String newValue) {
        boolean isExisted = true;
        if ("name".equals(field)) {
            this.setName(newValue);
        } else if ("address".equals(field)) {
            this.setAddress(newValue);
        } else if ("number".equals(field)){
            this.setNumber(newValue);
        } else {
            isExisted = false;
        }
        if (isExisted) {
            this.updateTimeLastEdit();
            System.out.println("Saved");
        }
    }

    @Override
    public String getFieldValue(String field) {
        if ("name".equals(field)) {
            return this.getName();
        } else if ("address".equals(field)) {
            return this.getAddress();
        } else if ("number".equals(field)){
            return this.getNumber();
        }
        return null;
    }

    @Override
    public Boolean isFound(String query) {
        return super.getName().toLowerCase().contains(query.toLowerCase())
                || this.getNumber().contains(query);
    }

    public String getInfo() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Organization name: " + super.getName() + "\n" +
                "Address: " + address + " \n"
                +  super.toString();
    }
}
