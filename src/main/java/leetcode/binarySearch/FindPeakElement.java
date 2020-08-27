package leetcode.binarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    public static int findPeakElement(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] > nums[mid + 1]) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return j;
    }
}
