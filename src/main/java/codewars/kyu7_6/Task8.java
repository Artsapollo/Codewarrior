package codewars.kyu7_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
You are given a string of n lines, each substring being n characters long: For example:

s = "abcd\nefgh\nijkl\nmnop"

We will study some transformations of this square of strings.

Vertical mirror: vert_mirror (or vertMirror or vert-mirror)
vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"
Horizontal mirror: hor_mirror (or horMirror or hor-mirror)
hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"
 */
public class Task8 {
    public static void main(String[] args) {
        String strng = "abcd,efgh,ijkl,mnop";
        System.out.println(vertMirror(strng));

    }

    public static String vertMirror(String strng) {
        return Arrays.stream(strng.split("\n"))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining("\n"));

    }

    public static String horMirror(String strng) {
        List<String> list = Arrays.asList(strng.split("\n"));
        Collections.reverse(list);
        return list.stream().collect(Collectors.joining("\n"));
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
