package codewars.kyu_7;

import java.util.Arrays;

/*
Consider an array of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
 */
public class Task25 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = (int)Arrays.stream(arrayOfSheeps).filter(a -> (a != null) && a).count();

        return count;
    }

}
