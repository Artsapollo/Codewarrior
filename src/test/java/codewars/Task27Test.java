package codewars;

import codewars.kyu_7.Task27;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task27Test {
    @Test
    public void test1() {
        assertEquals(1, Task27.rowSumOddNumbers(1));
        assertEquals(74088, Task27.rowSumOddNumbers(42));
    }
}