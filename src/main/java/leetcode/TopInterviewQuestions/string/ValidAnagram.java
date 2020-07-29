package leetcode.TopInterviewQuestions.string;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
//        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("ab", "a"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        char[] first = s.toCharArray();
        for (char f : first) {
            map.merge(f, 1, Integer::sum);
        }

        for (char k : t.toCharArray()) {
            if (map.containsKey(k) && map.get(k) > 0) {
                map.merge(k, -1, Integer::sum);
            } else {
                return false;
            }
        }

        return true;
    }
}
