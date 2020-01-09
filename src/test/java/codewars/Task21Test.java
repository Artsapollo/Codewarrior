package codewars;

import codewars.kyu_7.Task21;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task21Test {
    @Test
    public void FixedTests() {
        assertEquals(true, Task21.isIsogram("Dermatoglyphics"));
        assertEquals(true, Task21.isIsogram("isogram"));
        assertEquals(false, Task21.isIsogram("moose"));
        assertEquals(false, Task21.isIsogram("isIsogram"));
        assertEquals(false, Task21.isIsogram("aba"));
        assertEquals(false, Task21.isIsogram("moOse"));
        assertEquals(true, Task21.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Task21.isIsogram(""));
    }
}