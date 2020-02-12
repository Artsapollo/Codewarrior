package codewars.kyu7_6;

/*
По заданному массиву найдите int, которое появляется нечетное количество раз.

Там всегда будет только одно целое число, которое появляется нечетное количество раз
*/
public class Task9 {
    public static int findIt(int[] a) {
        int odd = 0;
        int counter = 0;

        for (int i : a) {
            for (int j : a) {
                if (i == j) {
                    counter++;
                }
            }
            if ((counter & 1) != 0) odd = i;
            counter = 0;
        }

        return odd;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5, 464, 464, 464, 464, 464}));
    }
}
