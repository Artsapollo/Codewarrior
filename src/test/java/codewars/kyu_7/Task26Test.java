package codewars.kyu_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task26Test {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Task26.nbYear(1500, 5, 100, 5000), 15);
        testing(Task26.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Task26.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}