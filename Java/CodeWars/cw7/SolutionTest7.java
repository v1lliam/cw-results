package Java.CodeWars.cw7;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest7 {
    @Test
    public void testSomething() {
        assertTrue(Kata7.zeroFuel(50, 25, 2));
        assertFalse(Kata7.zeroFuel(100, 50, 1));
    }
}
