package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class SubtractBetweenSumAndProduct {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        String number = String.valueOf(n);
        int[] sunn = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            sunn[i] = number.charAt(i) - '0';
        }

        int prod = 1;
        int sum = 0;

        for(int j = 0; j < sunn.length; j++){
            prod = prod * sunn[j];
            sum = sum + sunn[j];
        }

        return prod - sum;
    }
}
/*
Faster solution
public int subtractProductAndSum(int n) {
        long product = 1;
        long sum = 0;
        while(n>0){
            int digit = n%10;
            n = n / 10;
            product = product * digit;
            sum = sum + digit;
        }
        return (int)(product - sum);
    }
 */
