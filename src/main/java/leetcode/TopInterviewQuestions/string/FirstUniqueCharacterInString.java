package leetcode.TopInterviewQuestions.string;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        int counter = -1;

        if (s == null || s.length() < 1) {
            return counter;
        } else if (s.length() == 1) {
            return 0;
        }


        for (Character c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                counter = s.indexOf(c);
                break;
            }
        }

        return counter;
    }
}
