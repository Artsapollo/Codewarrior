package codewars.kyu7_6;

import java.util.ArrayList;
import java.util.List;

/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
 */
public class Task4 {
    public static int[] invert(int[] array) {
        List<Integer> inverted = new ArrayList<>();
        for (int i : array) {
            if (i != 0) {
                inverted.add(i - (i * 2));
            }else{
                inverted.add(0);
            }
        }
        int[] result = new int[inverted.size()];
        for (int i = 0; i < inverted.size(); i++) result[i] = inverted.get(i);
        return result;
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(invert(input1).toString());
    }
}
/*
        Faster
public static int[] invert(int[] array) {
    return java.util.Arrays.stream(array).map(i -> -i).toArray();
  }

or
public static int[] invert(int[] array) {
  for(int i = 0; i < array.length; i++) {
    array[i] *= -1;
  }
  return array;
  }
 */