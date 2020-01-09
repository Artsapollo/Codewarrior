package codewars;

import codewars.kyu7_6.Task20;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task20Test {
    @Test
    public void test1() {
        assertEquals("42 -9", Task20.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}