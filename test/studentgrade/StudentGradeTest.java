package studentgrade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Assignment Task: Re-implementing tests using JUnit 5.
 * Maintenance Type: Perfective Maintenance.
 */

public class StudentGradeTest {

    @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "F"; 
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}