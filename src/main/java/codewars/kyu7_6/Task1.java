package codewars.kyu7_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
https://www.codewars.com/kata/55c45be3b2079eccff00010f
 */
public class Task1 {
    private static String s1 = "is2 Thi1s T4est 3a";
    private static String s2 = "4of Fo1r pe6ople g3ood th5e the2";

    public static String order(String words) {
        String[] splitted = words.split(" ");
        List<String> strings = Arrays.asList(splitted);

        Collections.sort(strings, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return extractInt(o1) - extractInt(o2);
            }

            int extractInt(String s) {
                String num = s.replaceAll("\\D", "");
                return num.isEmpty() ? 0 : Integer.parseInt(num);
            }
        });

        StringBuilder result = new StringBuilder();

        for (String s : strings) {
            result.append(s + " ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(order(s1));
    }
}
/*
        Faster

    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
 */