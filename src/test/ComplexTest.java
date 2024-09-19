import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import demo.parallel.Complex;
public class ComplexTest {
    @Test
    public void testCube() {
        Complex c1 = new Complex(1, 1);
        Complex result = c1.cube();
        assertEquals(-2, result.getRe(), 1e-9);
        assertEquals(2, result.getIm(), 1e-9);
    }

    @Test
    public void testCubeZero() {
        Complex c2 = new Complex(0, 0);
        Complex result = c2.cube();
        assertEquals(0, result.getRe(), 1e-9);
        assertEquals(0, result.getIm(), 1e-9);
    }

    @Test
    public void testCubeNegative() {
        Complex c3 = new Complex(-1, -1);
        Complex result = c3.cube();
        assertEquals(-2, result.getRe(), 1e-9);
        assertEquals(-2, result.getIm(), 1e-9);
    }
}
