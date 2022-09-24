package Java.Grasshopper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class grasshopperTest {
    @Test 
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", grasshopper.greet("Lucy", "Lucy"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", grasshopper.greet("Greg", "Daniel"));
    }
}
