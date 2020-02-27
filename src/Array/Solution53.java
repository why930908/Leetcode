package Array;

public class Solution53 {
    public int maxSubArray(int[] nums){
        if (nums == null || nums.length == 0)
            return 0;
        int dp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length;i++){
            dp = Math.max(dp+nums[i],nums[i]);
            max = Math.max(dp,max);
        }
        return max;
    }
}
