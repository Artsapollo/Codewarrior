package codewars.kyu_7;

/*
The colors used by the printer are recorded in a control string.

"good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a,
 four times color b, one time color h then one time color a...

"bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.

Write a function which will output the error rate of the printer as a string
representing a rational whose numerator is the number of errors and the denominator the length of the control string.
Don't reduce this fraction to a simpler expression.

Input string has a length greater or equal to one and contains only letters from ato z.

#Examples:
s="aaabbbbhaijjjm"
error_printer(s) => "0/14"

s="aaaxbbbbyyhwawiwjjjwwm"
error_printer(s) => "8/22"
 */
public class Task28 {

    public static String printerError(String s) {
        char[] c = s.toCharArray();
        char[] errors = new char[]{'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int chars = s.length();
        int wrongChars = 0;


        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < errors.length; j++) {
                if (c[i] == errors[j]) {
                    wrongChars++;
                }
            }
        }
        return wrongChars + "/" + chars;
    }
}
/*
 Faster
s.replaceAll("[a-m]", "").length() + "/" + s.length();
 */
