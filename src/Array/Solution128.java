package Array;

import java.util.Arrays;

/**
 * Created by wanghaoyu on 2020/4/19
 */
public class Solution128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        Arrays.sort(nums);
        int cur = 1;
        int longest = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                continue;
            }
            else if (nums[i] == nums[i-1] +1){
                cur++;
                longest = Math.max(cur,longest);
            }else {

                cur = 1;
            }
        }
        return longest;
    }
}
