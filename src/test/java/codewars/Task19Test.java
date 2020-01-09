package codewars;

import codewars.kyu7_6.Task19;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task19Test {
    @Test
    public void test0() {
        assertEquals(0, Task19.countRedBeads(0));
    }

    @Test
    public void test1() {
        assertEquals(0, Task19.countRedBeads(1));
    }

    @Test
    public void test3() {
        assertEquals(4, Task19.countRedBeads(3));
    }

    @Test
    public void test5() {
        assertEquals(8, Task19.countRedBeads(5));
    }
}