package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Leetcode
 * @description: 非递增最短子序列
 * @author: Wanghaoyu
 * @create: 2020-06-11 18:20
 **/
public class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        Arrays.sort(nums);
        int tmp = 0;
        for (int i = nums.length - 1; i >= 0;i--){
            tmp += nums[i];
            res.add(nums[i]);
            if (tmp > sum - tmp){
                return res;
            }
        }
        return res;
    }
}
