package leetcode.BinaryLesson;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(runBinarySearchIteratively(array, 5, 1, 9));
    }

    public static int runBinarySearchIteratively(int[] array, int target, int low, int high) {
        int index = Integer.MAX_VALUE;
        int count = 0;

        while (low <= high) {
            System.out.println("Attempt " + count++);
            int mid = (low + high) / 2;
            if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] == target) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
























/*
public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;
        int attempt = 0;

        while (low <= high) {
            System.out.println("Attempt " + attempt++);
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
 */