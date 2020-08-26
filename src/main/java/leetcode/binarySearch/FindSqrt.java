package leetcode.binarySearch;

public class FindSqrt {
    public static void main(String[] args) {
        int mid2 = 1 + (10 - 1) / 2;
        int mid3 = (1 + 10) / 2;


        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int i = 0;
        int j = x;

        while(i <= j){
            int mid = i + (j - i) / 2;
            if(mid > x / mid){
                j = mid - 1;
            } else if(mid < x / mid){
                i = mid + 1;
            } else if(mid == x / mid){
                return mid;
            }
        }

        return j;
    }
}
