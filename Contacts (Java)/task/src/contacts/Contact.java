package contacts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public abstract class Contact {

    private String name;
    private String number;
    private String timeCreated;
    private String timeLastEdit;

    Boolean isPerson;

    Scanner scan;

    Contact() {
        init();
    }

    private void init() {
        this.name = "[no data]";
        this.number = "[no number]";
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        this.timeCreated = (LocalDateTime.now()).truncatedTo(ChronoUnit.SECONDS).format(dtf);
        this.updateTimeLastEdit();
        scan = new Scanner(System.in);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isNumberCorrect(number)) {
            this.number = number;
        } else {
            System.out.println("Wrong number format!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateTimeLastEdit() {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        this.timeLastEdit = (LocalDateTime.now()).truncatedTo(ChronoUnit.SECONDS).format(dtf);
    }

    public Boolean getIsPerson() {
        return isPerson;
    }

    public boolean isNumberCorrect(String number) {
        String regex = "\\+?\\(?\\w?\\)?\\s*\\w{0,4}[\\s\\-]?\\w{2,4}[\\s\\-]\\w{2,4}[\\s\\-]\\w{2,5}" +
                "|\\+?\\w?\\s?\\(?\\w{0,4}\\)*[\\s\\-]?\\w{2,4}[\\s\\-]\\w{2,4}[\\s\\-]\\w{2,5}";
        return number.matches(regex);
    }

    public String toString() {
        return "Number: " + number +"\n" +
                "Time created: " + timeCreated + "\n" +
                "Time last edit: " + timeLastEdit + "\n";
    }

    abstract String getEditableFields();

    abstract void editField(String field, String newValue);

    abstract String getFieldValue(String field);

    abstract Boolean isFound(String query);

    abstract String getInfo();

}
