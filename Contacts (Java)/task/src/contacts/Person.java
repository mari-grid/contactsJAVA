package contacts;

import java.util.Date;

public class Person extends Contact{
    private String surname;
    private String birthDate;
    private String gender;


    public Person() {
        super();
        init();
    }

    private void init() {
        //this.name = "[no data]";
        this.surname = "[no data]";
        this.birthDate = "[no data]";
        this.gender = "[no data]";
        this.isPerson = true;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (isBirthCorrect(birthDate)) {
            this.birthDate = birthDate;
        } else {
            System.out.println("Bad birth date!");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (isGenderCorrect(gender)) {
            this.gender = gender;
        } else {
            System.out.println("Bad gender!");
        }
    }

    public boolean isBirthCorrect(String birthDate) {
        String regex = "((19\\d\\d|20\\d\\d)[-/.](1[0-2]|0\\d)[-/.](0[1-9]|[1-2]\\d|3[0-1]))";
        return birthDate.matches(regex);
    }

    public boolean isGenderCorrect(String gender) {
        return "M".equals(gender) || "F".equals(gender);
    }

    @Override
    public String getEditableFields() {
        return "Select a field (name, surname, birth, gender, number): ";
    }

    @Override
    public void editField(String field, String newValue) {
        boolean isExisted = true;
        if ("name".equals(field)) {
            this.setName(newValue);
        } else if ("surname".equals(field)) {
            this.setSurname(newValue);
        } else if ("birth".equals(field)) {
            this.setBirthDate(newValue);
        } else if ("gender".equals(field)) {
            this.setGender(newValue);
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
        } else if ("surname".equals(field)) {
            return this.getSurname();
        } else if ("birth".equals(field)) {
            return this.getBirthDate();
        } else if ("gender".equals(field)) {
            return this.getGender();
        } else if ("number".equals(field)){
            return this.getNumber();
        }
        return null;
    }

    @Override
    public Boolean isFound(String query) {
        return super.getName().toLowerCase().contains(query.toLowerCase())
                || this.getSurname().toLowerCase().contains(query.toLowerCase())
                || this.getNumber().contains(query);
    }

    @Override
    public String getInfo() {
        return super.getName() + " " + this.getSurname();
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\n" +
                "Surname: " + surname + "\n" +
                "Birth date: " + birthDate + "\n" +
                "Gender: " + gender + "\n" + super.toString();
    }
}
