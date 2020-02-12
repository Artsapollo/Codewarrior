package codewars.kyu_8;

/*
Write a program that finds the summation of every number from 1 to num.
 The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 */
public class Task23 {
    public static void main(String[] args) {
        System.out.println(summation(2));
        System.out.println(summation(8));
        System.out.println(summation(15));
    }

    public static int summation(int n) {
        int result = 0;
        if (n == 1) return 1;
        else result = summation(n - 1) + n;
        return result;
    }
}

/*
        Faster
        return  n*(n+1)/2;
*/