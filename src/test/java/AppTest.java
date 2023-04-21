import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int expected = 5;
        int result = MyClass.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 3;
        int expected = 2;
        int result = MyClass.subtract(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        int a = 2;
        int b = 3;
        int expected = 6;
        int result = MyClass.multiply(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        int a = 6;
        int b = 3;
        int expected = 2;
        int result = MyClass.divide(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testZeroDivision() {
        int a = 6;
        int b = 0;
        try {
            int result = MyClass.divide(a, b);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
}
