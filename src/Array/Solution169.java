package Array;

import java.util.Arrays;

//Boyer-Moore
public class Solution169 {
    public int majorityElement(int[] nums) {
        /*int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count+= (num == candidate) ? 1 :-1 ;
        }
        return candidate;*/
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}