package codewars.kyu7_6;

/*
Find the length of the longest substring in the given string s that is the same in reverse.

As an example, if the input was “I like racecar that go fast”, the substring (racecar) length would be 7.

If the length of the input string is 0, the return value must be 0.

Example:
"a" -> 1
"aab" -> 2
"abcde" -> 1
"zzbaabcd" -> 4
"dcbaabzz
"" -> 0
 */
// 1. Find the longest substring
// 2. Is it equals that is the same in reverse

/*
Possible solution
Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("I like racecar that go fast"));
    }

    public static int longestPalindrome(final String s) {
        int counter = 0;

        if (!s.isEmpty()) {
            char[] origin = s.toCharArray();

            StringBuilder builder = new StringBuilder(s);
            builder.reverse();

            char[] revers = builder.toString().toCharArray();
            for (int i = 0; i < origin.length; i++) {
                for (int j = 0; j < revers.length; j++) {
                    if (origin[i] == revers[j]) {
                        counter++;
                        i++;
                    }else{
                        i++;
                    }
                }
            }
        }
        return counter;
    }
}
