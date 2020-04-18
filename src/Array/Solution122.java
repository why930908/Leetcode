package Array;

/**
 * Created by wanghaoyu on 2020/4/18
 */
//tanxin
public class Solution122 {
    public int maxProfit(int[] prices){
        if (prices.length <= 1){
            return 0;
        }
        int res = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] - prices[i-1] > 0){
                res+=(prices[i] - prices[i-1]);
            }
        }
        return res;
    }
}
