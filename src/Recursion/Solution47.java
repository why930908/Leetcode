package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/5
 */
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        helper(res,new ArrayList<Integer>(),nums,visited);
        return res;
    }
    private void helper(List<List<Integer>> res,ArrayList<Integer> tmp,int[] nums,boolean[] visited){
        if (tmp.size() == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            tmp.add(nums[i]);
            visited[i] = true;
            helper(res,tmp,nums,visited);
            tmp.remove(tmp.size()-1);
            visited[i] = false;
        }
    }
}
