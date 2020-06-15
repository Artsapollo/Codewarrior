package leetcode.TopInterviewQuestions.array;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);

        for (Integer a : arr) {
            System.out.println(a);
        }
    }
// Time O(n)
// Space O(1)

    public static void rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(0, arr.length - 1, arr);
        reverse(0, k - 1, arr);
        reverse(k, arr.length - 1, arr);
    }

    public static void reverse(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}




























/*
O(n2)
         for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }


// Time O(n)
// Space O(1)
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        revers(nums, 0, nums.length - 1);
        revers(nums, 0, k - 1);
        revers(nums, k, nums.length - 1);
    }

    public static void revers(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

 */
