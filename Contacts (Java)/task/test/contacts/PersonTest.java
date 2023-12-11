package contacts;

import junit.framework.TestCase;
import org.junit.Test;

public class PersonTest extends TestCase {

    @Test
    public void testGetSurname_whenDintSetIt() {
        Person person = new Person();
        String expectedResult = "[no data]";
        String actualResult = person.getSurname();
        assertEquals(expectedResult, actualResult);
    }
}