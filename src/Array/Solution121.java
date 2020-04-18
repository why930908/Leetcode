package Array;

/**
 * Created by wanghaoyu on 2020/4/18
 */
// dong tai gui hua
public class Solution121 {
    public int maxProfit(int[] prices){
        if (prices.length <= 1)
            return 0;
        int res = 0;
        int[] dp = new int[prices.length];
        int min = prices[0];
        for (int i = 1; i < prices.length; i++){
            min = Math.min(min,prices[i]);
            dp[i] = Math.max(dp[i-1],prices[i] - min);
        }
        return dp[prices.length-1];
    }
}
