package leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1,3,4,4}, 4));
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
