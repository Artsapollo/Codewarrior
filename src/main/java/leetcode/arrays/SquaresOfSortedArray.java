package leetcode.arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] ints = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(ints));
    }

    private static int[] sortedSquares(int[] A) {
        int i = 0, j = A.length - 1, index = A.length - 1;

        while(i < j){
            if(A[i] * A[i] > A[j] * A[j]){
                if(index == j) {
                    A[index--] = A[i] * A[i];
                    j--;
                } else{
                    A[index--] = A[i] * A[i];
                    i++;
                }
            } else {
                A[index--] = A[j] * A[j];
                j--;
            }
        }

        return A;
    }
}

/*
public int[] sortedSquares(int[] A) {
        int i = 0, j = A.length - 1, index = A.length - 1;

        while(i < j){
            if(A[i] * A[i] > A[j] * A[j]){
                A[index--] = A[i] * A[i];
                i++;
            } else {
                A[index--] = A[j] * A[j];
                j--;
            }
        }



        return A;
    }
 */

/*
 int start = 0;
        int end = A.length - 1;
        int[] out = new int[A.length];
        int index = A.length - 1;

        while (index >= 0) {
            if (A[start] * A[start] > A[end] * A[end]) {
                out[index--] = A[start] * A[start];
                start++;
            } else {
                out[index--] = A[end] * A[end];
                end--;
            }
        }

        return out;
 */