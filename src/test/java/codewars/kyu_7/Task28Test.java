package codewars.kyu_7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task28Test {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Task28.printerError(s));
    }
}