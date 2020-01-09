package codewars.kyu7_6;

import static java.lang.Integer.MIN_VALUE;

/*
Find the length of the longest substring in the given string s that is the same in reverse.

As an example, if the input was “I like racecar that go fast”, the substring (racecar) length would be 7.

If the length of the input string is 0, the return value must be 0.

Example:
"a" -> 1
"aab" -> 2
"abcde" -> 1
"zzbaabcd" -> 4
"" -> 0
 */
// 1. Find the longest substring
// 2. Is it equals that is the same in reverse
public class Task11 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("I like racecar that go fast"));
    }

    public static String longestPalindrome(final String s) {
        //Solution
        if (!s.isEmpty()) {
            String[] origin = s.split(" ");

            StringBuilder builder = new StringBuilder(s);
            builder.reverse();

            String[] rev = builder.toString().split(" ");

            String word = "";
            int min = MIN_VALUE;

            for (String w : origin) {
                for (String r : rev) {
                    if (w.equals(r) && w.length() > min) {
                        if (word.isEmpty()) {
                            word += w;
                        } else {
                            word = word.replaceAll("\\D", "");
                            word += w;
                        }
                        min = w.length();
                    }
                }
            }
            return word;
        }
        return "0";
    }
}
