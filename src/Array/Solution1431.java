package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:22
 **/
public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++){
            max = Math.max(max,candies[i]);
        }
        for (int i = 0; i < candies.length; i++){
            if (candies[i] + extraCandies >= max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}
