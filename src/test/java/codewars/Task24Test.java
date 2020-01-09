package codewars;

import codewars.kyu_6.Task24;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Task24Test {
    @Test
    public void Test() {
        assertEquals("Should return true", true, Task24.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, Task24.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals("Should return false", false, Task24.isValid(new char[] {'w'}));
        assertEquals("Should return false", false, Task24.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
        assertEquals("Should return false", false, Task24.isValid(new char[] {'n','n','n','s','n','s','n','s','n','n'}));
    }
}