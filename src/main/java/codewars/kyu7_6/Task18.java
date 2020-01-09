package codewars.kyu7_6;

/*
Write a function named repeater() that takes two arguments (a string and a number),
and returns a new string where the input string is repeated that many times

Example: Repeater.repeat("a", 5)
Result: "aaaaa"

*/
public class Task18 {
    public static String repeat(String string, long n) {
        //My solution is best practice
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeat("Wub ", 6));
        System.out.println(repeat("Na", 16));
        System.out.println(repeat("a", 5));

    }
}
