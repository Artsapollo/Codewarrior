package leetcode.binaryLesson;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(runBinarySearchIteratively(array, (array[0] + array[array.length-1]) / 2, array[0], array[array.length-1]));
    }

    private static int runBinarySearchIteratively(int[] array, int target, int min, int max){
        int result = Integer.MAX_VALUE;

        while(min <= max){
            int mid = (min + max) / 2;
            if(array[mid] > target){
                max = mid - 1;
            } else if(array[mid] < target){
                min = mid + 1;
            } else if(array[mid] == target){
                result = array[mid];
                break;
            }
        }

        return result;
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