package leetcode.TopInterviewQuestions;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);

        for (Integer a : arr) {
            System.out.println(a);
        }
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }
}
