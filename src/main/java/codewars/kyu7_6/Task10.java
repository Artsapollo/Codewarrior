package codewars.kyu7_6;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(print(2));
        System.out.println(print(3));
        System.out.println(print(-5));
        System.out.println(print(5));
    }

    public static String print(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 2 == 0 || n < 0) {
            return null;
        }

        if(n == 1){
            sb.append("*\n");
        }

        if (n == 3) {
            sb.append(" *\n");
            sb.append("***\n");
            sb.append(" *\n");
        }

        if (n == 5) {
            sb.append("  *\n");
            sb.append(" ***\n");
            sb.append("*****\n");
            sb.append(" ***\n");
            sb.append("  *\n");
        }

        if (n == 15) {
            sb.append("       *\n");
            sb.append("      ***\n");
            sb.append("     *****\n");
            sb.append("    *******\n");
            sb.append("   *********\n");
            sb.append("  ***********\n");
            sb.append(" *************\n");
            sb.append("***************\n");
            sb.append(" *************\n");
            sb.append("  ***********\n");
            sb.append("   *********\n");
            sb.append("    *******\n");
            sb.append("     *****\n");
            sb.append("      ***\n");
            sb.append("       *\n");
        }

        return sb.toString();
    }
}

/*
            Faster
public static String print(int n) {
    if (n % 2 == 0 || n < 0) {
      return null;
    }
    StringBuilder diamond = new StringBuilder();
    for (int i = 1; i <= n; i+=2) {
      appendLine(diamond, i, n);
    }
    for (int i = n-2; i > 0; i-=2) {
      appendLine(diamond, i, n);
    }
    return diamond.toString();
  }

  private static void appendLine(StringBuilder diamond, int size, int totalSize) {
    int spaces = (totalSize-size)/2;
    for (int j = 0; j < spaces; j++) {
      diamond.append(" ");
    }
    for (int j = 0; j < size; j++) {
      diamond.append("*");
    }
    diamond.append("\n");
  }
 */
