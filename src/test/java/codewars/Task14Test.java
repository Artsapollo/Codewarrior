package codewars;

import codewars.kyu7_6.Task14;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task14Test {
    @Test
    public void Test1() {
        assertEquals("ABC", new Task14().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new Task14().SongDecoder("RWUBWUBWUBLWUB"));
    }
}