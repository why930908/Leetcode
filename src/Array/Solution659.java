package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanghaoyu on 2020/4/18
 */
public class Solution659 {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> num = new HashMap<>();
        Map<Integer,Integer> tail = new HashMap<>();
        for (int numss : nums){
            num.put(numss,num.getOrDefault(numss,0)+1);
        }
        for (int numss : nums){
            if (num.get(numss) == 0){
                continue;
            }else if (tail.getOrDefault(numss-1,0) > 0 && num.get(numss) > 0){
                tail.put(numss,tail.getOrDefault(numss,0)+1);
                tail.put(numss-1,tail.get(numss-1)-1);
                num.put(numss,num.get(numss)-1);
            }else if (num.get(numss) > 0 && num.getOrDefault(numss+1,0) > 0 && num.getOrDefault(numss+2,0) > 0){
                num.put(numss,num.get(numss) - 1);
                num.put(numss+1,num.get(numss+1)-1);
                num.put(numss+2,num.get(numss+2)-1);
                tail.put(numss+2,tail.getOrDefault(numss+2,0)+1);
            }else return false;
        }
        return true;
    }
}
