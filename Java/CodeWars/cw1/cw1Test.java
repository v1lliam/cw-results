package Java.CodeWars.cw1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class cw1Test {
    @Test
    public void test() {
        new cw1();
        assertEquals(811181, cw1.sumSquare(9119));
        new cw1();
        assertEquals(0, cw1.sumSquare(0));
      }
}
