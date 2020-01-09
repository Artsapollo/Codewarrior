package codewars.kyu7_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples:
number(Arrays.asList()) # => []
number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
 */
public class Task13 {
    public static List<String> number(List<String> lines) {
        int counter = 1;

        List<String> result = new ArrayList<>();
        if (!lines.isEmpty()) {
            for (String s : lines) {
                result.add(counter++ + ": " + s);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        number(Arrays.asList("a", "b", "c"));
    }
}
