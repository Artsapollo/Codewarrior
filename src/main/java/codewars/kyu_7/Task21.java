package codewars.kyu_7;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
 Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case
 */
public class Task21 {
    public static void main(String[] args) {
//        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("moose"));
    }

    public static boolean isIsogram(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (i != chars.length - 1 && chars[i] == chars[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
/*
Best practise return str.length() == str.toLowerCase().chars().distinct().count();
 */
