package leetcode.binarySearch;

public class SearchRotateSortArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public static int search(int[] nums, int target) {
        int pivot = findRotationPivot(nums);

        int firstPart = findIndex(nums, 0, pivot, target);
        int secondPart = findIndex(nums, pivot, nums.length - 1, target);

        if (firstPart > secondPart) {
            return firstPart;
        } else {
            return secondPart;
        }

    }

    private static int findIndex(int[] arr, int i, int j, int target) {
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }

    private static int findRotationPivot(int[] arr) {
        if (arr.length < 2) return 0;
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                index = i + 1;
                break;
            }
        }
        return index;
    }
}
