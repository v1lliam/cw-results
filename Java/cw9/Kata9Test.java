package Java.cw9;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata9Test {
    @Test public void test4a() {
        assertEquals("aaaa", Kata9.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Kata9.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Kata9.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Kata9.repeatStr(0, "kata"));
    }
}
