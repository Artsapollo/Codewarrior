package leetcode.TopInterviewQuestions.string;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {

        if (s.isEmpty()) return true;
        char[] car = s.toCharArray();
        int i = 0;
        int j = car.length - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(car[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(car[j])) {
                j--;
            } else if (Character.toLowerCase(car[i++]) != Character.toLowerCase(car[j--])) {
                return false;
            }
        }

        return true;
    }
}


/*
My first solution

        if (s.isEmpty()) return true;

        String k = s.replaceAll("\\W", "").toLowerCase().trim();

        int i = 0;
        int j = k.length() - 1;

        while (i < j) {
            if (k.charAt(i) != k.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
 */