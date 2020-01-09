package codewars;

import codewars.kyu7_6.Task17;

import static org.junit.Assert.assertEquals;

public class Task17Test {

//    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, Task17.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)", true, Task17.isSquare(0));
        assertEquals("3 isn't a square number", false, Task17.isSquare(3));
        assertEquals("4 is a square number (2 * 2)", true, Task17.isSquare(4));
        assertEquals("25 is a square number (5 * 5)", true, Task17.isSquare(25));
        assertEquals("26 isn't a square number", false, Task17.isSquare(26));
    }
}