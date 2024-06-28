package n88_merge_sorted_array;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1 = m - 1;
        int arr2 = n - 1;
        int k = nums1.length - 1;

        while (arr2 >= 0) {
            if (arr1 >= 0 && nums1[arr1] > nums2[arr2]) {
                nums1[k--] = nums1[arr1--];
            } else {
                nums1[k--] = nums2[arr2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4, 0, 0, 0};
        int[] nums2 = new int[]{2, 2, 3};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
