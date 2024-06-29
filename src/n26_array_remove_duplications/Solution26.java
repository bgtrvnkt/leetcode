package n26_array_remove_duplications;

import java.util.Arrays;

public class Solution26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j++] != nums[i]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}