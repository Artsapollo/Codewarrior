package codewars;

import codewars.kyu7_6.Task18;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task18Test {
    @Test
    public void testSomething() {
        assertEquals("aaaaa", Task18.repeat("a", 5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa", Task18.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ", Task18.repeat("Wub ", 6));
    }

}