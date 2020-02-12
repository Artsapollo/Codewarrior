package codewars.kyu7_6;

/*
https://www.codewars.com/kata/highest-and-lowest/train/java

In this little assignment you are given a string of space separated numbers,
 and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */
public class Task20 {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));

    }

    public static String highAndLow(String numbers) {
        int temp = 0;

        String[] characters = numbers.split(" ");

        int[] digits = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            digits[i] = Integer.parseInt(characters[i]);
        }

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (i != j) {
                    if (digits[i] < digits[j]) {
                        temp = digits[j];
                        digits[j] = digits[i];
                        digits[i] = temp;
                    }
                }
            }
        }

        String min = String.valueOf(digits[0]);
        String max = String.valueOf(digits[digits.length - 1]);

        return max + " " + min;
    }

    /*
                 Faster
        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
     */
}
