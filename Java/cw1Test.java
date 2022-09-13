package Java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class cw1Test {
    @Test
    public void test() {
        assertEquals(811181, new cw1().sumSquare(9119));
        assertEquals(0, new cw1().sumSquare(0));
      }
}
