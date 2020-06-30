package Array;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:13
 **/
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (i >= 1) dp[i] = dp[i-1] + nums[i];
            if (i == 0) dp[i] = nums[0];
        }
        return dp;
    }
}
