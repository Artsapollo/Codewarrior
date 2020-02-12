package codewars.kyu7_6;

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2};

        int out = squareSum(numbers);
        System.out.println(out);
    }

    public static int squareSum(int[] n) {
        int result = 0;
        for (int i : n) {
            result += i * i;
        }
        return result;
    }
}

/*
        Faster
        return Arrays.stream(xs).map(x -> x * x).sum();
*/
