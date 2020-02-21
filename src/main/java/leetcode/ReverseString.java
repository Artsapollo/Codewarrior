package leetcode;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reversTheString("Hello world!"));
    }

    static String reversTheString(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        return sb.toString();
    }
}
