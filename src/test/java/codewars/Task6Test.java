package codewars;

import codewars.kyu7_6.Task6;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task6Test {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Task6.whoLikesIt());
        assertEquals("Peter likes this", Task6.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Task6.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Task6.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Task6.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}