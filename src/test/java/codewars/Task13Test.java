package codewars;

import codewars.kyu7_6.Task13;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task13Test {

    @Test
    public void basicTests() {
        assertEquals(Arrays.asList(), Task13.number(Arrays.asList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), Task13.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), Task13.number(Arrays.asList("", "", "", "", "")));
    }

}