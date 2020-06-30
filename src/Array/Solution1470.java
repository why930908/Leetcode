package Array;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:27
 **/
public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++){
            res[j++] = nums[i];
            res[j++] = nums[i+n];
        }
        return res;
    }
}
