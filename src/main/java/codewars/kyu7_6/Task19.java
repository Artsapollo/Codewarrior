package codewars.kyu7_6;
/*
Two red beads are placed between every two blue beads. There are N blue beads.
 After looking at the arrangement below work out the number of red beads.

b rr b rr b rr b rr b rr b

Implement countRedBeads(n) so that it returns the number of red beads.
If there are less than 2 blue beads return 0.
 */

public class Task19 {
    public static void main(String[] args) {
        System.out.println("Result 1 - "+countRedBeads(2));
        System.out.println("Result 2 - "+countRedBeads(3));
        System.out.println("Result 3 - "+countRedBeads(4));
        System.out.println("Result 4 - "+countRedBeads(5));
        System.out.println("Result 5 - "+countRedBeads(6));
    }

    public static int countRedBeads(final int nBlue) {
        int redCount = 2;
        int result = 0;

        if (nBlue < 2) return 0;
        else {
            for (int i = nBlue; i > 1; --i) {
                result += redCount;
            }
        }

        //Best practise
//    public static int countRedBeads(final int n) {
//      return n < 2 ? 0 : 2*n - 2;
//    }

        return result;
    }
}
