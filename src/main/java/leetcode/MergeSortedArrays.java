package leetcode;

/*
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
}

/*
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //позиции с которых будем проверять инициализированные значения в массивах
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1; //количество элементов в финальном массиве

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
 */

/*
        int index = m;

        for (int i = 0; i < nums2.length; i++) {
            nums1[index] = nums2[i];
            index++;
        }

        int index2 = 0;
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[index2] > nums1[i]) {
                int temp = nums1[i];
                nums1[i] = nums1[index2];
                nums1[index2] = temp;
            } else {
                index2++;
            }
        }
 */