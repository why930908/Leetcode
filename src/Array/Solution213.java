package Array;

import java.util.Arrays;

/**
 * Created by wanghaoyu on 2020/3/23
 */
public class Solution213 {
    public int rob(int[] nums){
        if (nums.length == 0)return 0;
        if (nums.length == 1)return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums,0,nums.length-1)),myRob(Arrays.copyOfRange(nums,1,nums.length)));
    }
    private int myRob(int[] nums){
        int len = nums.length;
        if (len == 0) return 0;
        int dp[] = new int[len+1];
        dp[1] = nums[0];
        for (int i =2; i <= len; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i-1]);
        }
        return dp[len];
    }
}
