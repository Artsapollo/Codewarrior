package leetcode;

public class FindNuiqueIntegers {

    public static void main(String[] args) {
        int[] result = sumZero(5);

        for(int i : result){
            System.out.println(i);
        }
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int count = n;

        for (int i = 0; i < n; i++) {
            arr[i] = (i * 2) - n + 1;
        }

        return arr;

    }
}
