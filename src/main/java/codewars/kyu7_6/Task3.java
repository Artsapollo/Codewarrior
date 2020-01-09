package codewars.kyu7_6;

/*
Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
 */
public class Task3 {
    public static int grow(int[] x) {
        int result = 1;
        for(int i : x){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4};

        System.out.println(grow(x));
    }
}
