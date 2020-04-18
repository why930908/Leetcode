package Array;

import java.util.Map;

/**
 * Created by wanghaoyu on 2020/4/18
 */
//双指针
public class Solution11 {
    public int maxArea(int[] height){
        if (height.length <= 1)
            return 0;
        int res = 0;
        int j = height.length-1;
        int i = 0;
        while (i < j){
            res = Math.max(res,height[i] < height[j] ? (j - i)*height[i++] : (j-i)*height[j--]) ;
        }
        return res;
    }
}
