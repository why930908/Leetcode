package Array;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            map.put(nums[i],target-nums[i]);
        }
        for (int i= 0; i < nums.length;i++){
            int comp = target - nums[i];
            if (map.containsKey(comp) && )
    }
}
