package leetcode.binarySearch;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        int i = 1, x = n;

        while(i < x) {
            int mid = (i + x) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if(guess(mid) < 0) {
                i = mid + 1;
            } else {
                x = mid - 1;
            }
        }
        return i;
    }

    private static int guess(int n){
        if (n == 6) return 0;
        else if(n > 6) return 1;
        else return -1;
    }
}
