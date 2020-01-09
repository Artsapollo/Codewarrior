package codewars.kyu7_6;

public class Task2 {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) result.append("-");
            result.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) result.append(Character.toLowerCase(c));
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));

//        accum("abcd"); //"A-Bb-Ccc-Dddd"
//        accum("RqaEzty"); //"R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt"); //"C-Ww-Aaa-Tttt"
    }
}





/*
StringBuilder result = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if(i > 0) result.append('-');
            result.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) result.append(Character.toLowerCase(c));
            i++;
        }
        return result.toString();
 */
