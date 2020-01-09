package codewars.kyu7_6;

import java.util.Arrays;

/*
Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.

Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
Each part will be in a string
Elements of a pair must be in the same order as in the original array.
Examples of returns in different languages:
a = ["az", "toto", "picaro", "zone", "kiwi"] -->

[["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
 */
public class Task15 {
    public static String[][] partlist(String[] arr) {

        String[][] result = new String[arr.length - 1][2];
        for (int i = 0; i < arr.length - 1; ++i) {
            result[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i + 1));
            result[i][1] = String.join(" ", Arrays.copyOfRange(arr, i + 1, arr.length));
        }

        return result;
    }

    public static void main(String[] args) {
        String[][] matrix = partlist(new String[]{"az", "toto", "picaro", "zone", "kiwi"});

    }
}

//Shorter solution
/*
public static String[][] partlist(String[] arr) {
        String[][] returnArray = new String[arr.length-1][2];
        for(int i = 0; i < arr.length-1; ++i) {
          returnArray[i][0] = String.join(" ", Arrays.copyOfRange(arr, 0, i+1));
          returnArray[i][1] = String.join(" ", Arrays.copyOfRange(arr, i+1, arr.length));
        }

        return returnArray;
    }
 */

/*
My Solution

 StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        String[][] result = new String[arr.length - 1][2];

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr.length) {

                for (int g = 0; g <= i; g++) {
                    first.append(arr[g] + " ");
                }
                result[i][0] = first.toString().trim();
                first.setLength(0);

                for (int j = i + 1; j < arr.length; j++) {
                    second.append(arr[j] + " ");
                }
                result[i][1] = second.toString().trim();
                second.setLength(0);
            }
        }

 */
