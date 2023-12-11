package contacts;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /*@Test
    public void testGetName_whenDidntSetName() {
        Person person = new Person();
        String expectedResult = "[no data]";
        String actualResult = person.getName();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetNumber_whenDidntSetNumber() {
        Person person = new Person();
        String expectedResult = "[no number]";
        String actualResult = person.getNumber();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetSurname_whenDidntSetSurname() {
        Person person = new Person();
        String expectedResult = "[no data]";
        String actualResult = person.getSurname();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetName_whenSetName() {
        Person person = new Person();
        person.setName("Maryna");
        String expectedResult = "Maryna";
        String actualResult = person.getName();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetSurname_whenSetSurname() {
        Person person = new Person();
        person.setSurname("Cherk");
        String expectedResult = "Cherk";
        String actualResult = person.getSurname();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetNumber_whenSetCorrectNumber() {
        Person person = new Person();
        person.setNumber("+3 8067 397 4112");
        String expectedResult = "+3 8067 397 4112";
        String actualResult = person.getNumber();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetBirthday_whenDidntSetBirthday() {
        Person person = new Person();
        String expectedResult = "[no data]";
        String actualResult = person.getBirthDate();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetBirthday_whenSetCorrectBirthday() {
        Person person = new Person();
        person.setBirthDate("1982/12/18");
        String expectedResult = "1982/12/18";
        String actualResult = person.getBirthDate();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetBirthday_whenSetInCorrectBirthday() {
        Person person = new Person();
        person.setBirthDate("18.12.1982");
        String expectedResult = "[no data]";
        String actualResult = person.getBirthDate();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetBirthdayMessage_whenSetInCorrectBirthday() {
        Person person = new Person();
        person.setBirthDate("18.12.1982");
        String expectedResult = "Bad birth date!";
        assertEquals(expectedResult, outputStreamCaptor.toString()
                .trim());
    }
    @Test
    public void testGetGender_whenDidntSetGender() {
        Person person = new Person();
        String expectedResult = "[no data]";
        String actualResult = person.getGender();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetGender_whenSetCorrectGender() {
        Person person = new Person();
        person.setGender("M");
        String expectedResult = "M";
        String actualResult = person.getGender();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetGender_whenSetIncorrectGender() {
        Person person = new Person();
        person.setGender("A");
        String expectedResult = "[no data]";
        String actualResult = person.getGender();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetGenderMessage_whenSetIncorrectGender() {
        Person person = new Person();
        person.setGender("A");
        String expectedResult = "Bad gender!";
        assertEquals(expectedResult, outputStreamCaptor.toString()
                .trim());
    }
    @Test
    public void testGetNumber_whenSetIncorrectNumber() {
        Person person = new Person();
        person.setNumber("+380");
        String expectedResult = "[no number]";
        String actualResult = person.getNumber();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetNumberMessage_whenSetIncorrectNumber() {
        Person person = new Person();
        person.setNumber("+380");
        String expectedResult = "Wrong number format!";
        assertEquals(expectedResult, outputStreamCaptor.toString()
                .trim());
    }
    @Test
    public void testEditField_whenFieldExists() {
        Person person = new Person();
        person.editField("surname", "Cherk");
        String expectedResult = "Cherk";
        String actualResult = person.getSurname();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEditFieldMessage_whenFieldExists() {
        Person person = new Person();
        person.editField("surname", "Cherk");
        String expectedResult = "Saved";
        assertEquals(expectedResult, outputStreamCaptor.toString()
                .trim());
    }
    @Test
    public void testGetFieldValue_whenFieldExists() {
        Person person = new Person();
        person.editField("gender", "F");
        String expectedResult = "F";
        String actualResult = person.getGender();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetFieldValue_whenFieldDoesntExists() {
        Person person = new Person();
        assertNull(person.getFieldValue("DoesntExists"));
    }
    @Test
    public void testIsFound_whenSearchingByName() {
        Person person = new Person();
        person.setName("Maryna");
        person.setSurname("Cherk");
        person.setNumber("+38 067-397-41-12");
        assertTrue(person.isFound("Maryna"));
    }
    @Test
    public void testIsFound_whenSearchingBySurname() {
        Person person = new Person();
        person.setName("Maryna");
        person.setSurname("Cherk");
        person.setNumber("+38 067-397-41-12");
        assertTrue(person.isFound("Cherk"));
    }
    @Test
    public void testIsFound_whenSearchingByNumber() {
        Person person = new Person();
        person.setName("Maryna");
        person.setSurname("Cherk");
        person.setNumber("+3 8067 397 4112");
        assertTrue(person.isFound("+3 8067 397 4112"));
    }
    @Test
    public void testGetInfo() {
        Person person = new Person();
        person.setName("Maryna");
        person.setSurname("Cherk");
        String actualResult = person.getInfo();
        String expectedResult = "Maryna Cherk";
        assertEquals(expectedResult, actualResult);
    }*/

}