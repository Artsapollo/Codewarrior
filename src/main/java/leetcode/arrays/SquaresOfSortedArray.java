package leetcode.arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    private static int[] sortedSquares(int[] A) {
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
    }
}
