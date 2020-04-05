package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/4
 */
public class Solution46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        helper(res,new ArrayList<Integer>(),nums,visited);
        return res;
    }
    public void helper(List<List<Integer>> res,ArrayList<Integer> cur,int[] nums,int[] visited){
        if (cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length;i++){
            if (visited[i] == 1) continue;
            visited[i] = 1;
            cur.add(nums[i]);
            helper(res,cur,nums,visited);
            visited[i] = 0;
            cur.remove(cur.size()-1);
        }
    }
}
