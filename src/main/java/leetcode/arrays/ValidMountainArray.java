package leetcode.arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
    }

    public static boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;

        int index = 0;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i + 1] <= A[i]){
                index = i;
                break;
            }
        }

        if(index == 0 || index == A.length - 1) return false;

        for(int i = index; i < A.length - 1; i++){
            if(A[i] <= A[i + 1]){
                return false;
            }
        }

        return true;
    }
}
