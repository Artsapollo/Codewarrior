package codewars.kyu7_6;

/*
Description
We need a function that can transform a string into a number. What ways of achieving this do you know?

Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.

Examples
stringToNumber("1234") == 1234
stringToNumber("605" ) == 605
stringToNumber("1405") == 1405
stringToNumber("-7"  ) == -7
 */
public class Task7 {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String str1 = "1234";
        System.out.println(stringToNumber(str1));
    }
}
