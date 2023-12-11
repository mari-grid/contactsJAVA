package contacts;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrganizationTest extends TestCase {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void testGetOrganizationName_whenDidntSetName() {
        Organization org = new Organization();
        String expectedResult = "[no data]";
        String actualResult = org.getName();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationName_whenSetName() {
        Organization org = new Organization();
        org.setName("Pizza");
        String expectedResult = "Pizza";
        String actualResult = org.getName();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationNumber_whenDidntSetNumber() {
        Organization org = new Organization();
        String expectedResult = "[no number]";
        String actualResult = org.getNumber();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationNumber_whenSetCorrectNumber() {
        Organization org = new Organization();
        org.setNumber("+3 8067 397 4112");
        String expectedResult = "+3 8067 397 4112";
        String actualResult = org.getNumber();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationNumber_whenSetIncorrectNumber() {
        Organization org = new Organization();
        org.setNumber("+380");
        String expectedResult = "[no number]";
        String actualResult = org.getNumber();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationNumberMessage_whenSetIncorrectNumber() {
        Organization org = new Organization();
        org.setNumber("+380");
        String expectedResult = "Wrong number format!";
        assertEquals(expectedResult, outputStreamCaptor.toString()
                .trim());
    }
    @Test
    public void testGetOrganizationAddress_whenDidntSetAddress() {
        Organization org = new Organization();
        String expectedResult = "[no data]";
        String actualResult = org.getAddress();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationAddress_whenSetAddress() {
        Organization org = new Organization();
        org.setAddress("Pizza Street");
        String expectedResult = "Pizza Street";
        String actualResult = org.getAddress();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEditOrganizationField_whenFieldExists() {
        Organization org = new Organization();
        org.editField("name", "Pizza");
        String expectedResult = "Pizza";
        String actualResult = org.getName();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testEditOrganizationFieldMessage_whenFieldExists() {
        Organization org = new Organization();
        org.editField("name", "Pizza");
        String expectedResult = "Saved";
        assertEquals(expectedResult, outputStreamCaptor.toString()
                .trim());
    }
    @Test
    public void testGetOrganizationFieldValue_whenFieldExists() {
        Organization org = new Organization();
        org.editField("address", "Spring Street");
        String expectedResult = "Spring Street";
        String actualResult = org.getAddress();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOrganizationFieldValue_whenFieldDoesntExists() {
        Organization org = new Organization();
        assertNull(org.getFieldValue("DoesntExists"));
    }
    @Test
    public void testIsFoundOrganization_whenSearchingByName() {
        Organization org = new Organization();
        org.setName("Pizza");
        org.setNumber("+38 067-397-41-12");
        assertTrue(org.isFound("Pizza"));
    }
    @Test
    public void testIsFoundOrganization_whenSearchingByNumber() {
        Organization org = new Organization();
        org.setName("Maryna");
        org.setNumber("+3 8067 397 4112");
        assertTrue(org.isFound("+3 8067 397 4112"));
    }
    @Test
    public void testGetOrganizationInfo() {
        Organization org = new Organization();
        org.setName("Maryna");
        String actualResult = org.getInfo();
        String expectedResult = "Maryna";
        assertEquals(expectedResult, actualResult);
    }
}