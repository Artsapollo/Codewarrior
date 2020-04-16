package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}};

        List<Integer> result = luckyNumbers(matrix);
        System.out.println(result.toString());
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix, row);
            int value = matrix[row][minCol];
            if (checkIfMaxInCol(matrix, minCol, value)) {
                result.add(value);
            }
        }
        return result;
    }

    public static int minColInRow(int[][] matrix, int row) {
        int minIndex = 0;
        int minValue = matrix[row][minIndex];

        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] < minValue) {
                minValue = matrix[row][i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int i = 0; i < matrix.length; i++) {
            if (value < matrix[i][col]) {
                return false;
            }
        }
        return true;
    }
}
