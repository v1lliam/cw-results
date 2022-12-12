package Java.CodeWars.cw4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Kata4.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Kata4.find_average(new int[]{1, 2, 3}), DELTA);
    }
}