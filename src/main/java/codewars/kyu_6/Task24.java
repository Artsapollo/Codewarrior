package codewars.kyu_6;

/*
https://www.codewars.com/kata/take-a-ten-minute-walk/train/java

Everytime you press the button it sends you an array of one-letter strings representing directions to walk
 (eg. ['n', 's', 'w', 'e']). You always walk only a single block in a direction and you know it takes you one minute
  to traverse one city block, so create a function that will return true if the walk that app gives you
   will take you exactly ten minutes and will, of course, return you to your starting point. Return false otherwise.
 */
public class Task24 {
    public static void main(String[] args) {
//        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
//        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 'n'}));
    }
       // My solution (Not works well)

        public static boolean isValid(char[] walk) {
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;

        if (walk.length != 10) return false;
        else {
            for (int i = 0; i < walk.length; i++) {
                if (walk[i] == 'n') n++;
                else if (walk[i] == 'w') w++;
                else if (walk[i] == 's') s++;
                else if (walk[i] == 'e') e++;
            }
        }

        boolean straight = false;
        boolean sides = false;

        if (n != 0 || s != 0) {
            if (n == s) {
                straight = true;
            } else straight = false;
        }

        if (w != 0 || e != 0) {
            if (w == e) {
                sides = true;
            } else sides = false;
        }

        if (straight && sides) {
            return true;
        } else if (sides) {
            return true;
        } else if (straight) {
            return true;
        }

        for (Character c : walk) {
            System.out.println(c);
        }

        return false;
    }

    //    public static boolean isValid(char[] walk) {
//        //Best practise
//        if (walk.length != 10) {
//            return false;
//        }
//
//        int x = 0;
//        int y = 0;
//        for (int i = 0; i < 10; i++) {
//            switch (walk[i]) {
//                case 'n': x++;
//                    break;
//                case 's': x--;
//                    break;
//                case 'w': y++;
//                    break;
//                case 'e': y--;
//                    break;
//            }
//        }
//        return x == 0 && y == 0;
//    }

}
