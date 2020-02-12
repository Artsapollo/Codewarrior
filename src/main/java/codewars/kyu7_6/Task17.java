package codewars.kyu7_6;

public class Task17 {
    public static boolean isSquare(int n) {
        for (int i = 0; i < 9801; i++) {
            if (i * i == n && i * i >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
        System.out.println(isSquare(3709476));
        System.out.println(isSquare(82944));
        System.out.println(isSquare(213477865));
    }
}
  /*
    Faster
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
     */