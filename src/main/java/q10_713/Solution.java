package q10_713;

/*
 * https://leetcode.com/contest/leetcode-weekly-contest-55/problems/subarray-product-less-than-k/
 * Hint: Greedy + List
 *
 * 请将代码提交到上面的网址进行测试
 */

import java.util.Arrays;

public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product;

                for (int i = 0; i < nums.length; i++) {
                    product = nums[i];

                    if (nums[i] > k) continue;
                    else count++;

                    for (int j = i+1; j<nums.length; j++) {
                        product = product * nums[j];
                        if (product < k) count++;
                        else break;
                    }
                }



             return count;
        }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {6, 2, 5, 10};
        System.out.println(solution.numSubarrayProductLessThanK(arr, 100));
    }
}