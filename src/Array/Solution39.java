package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/6
 */
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,new LinkedList<Integer>(),target,candidates,0,0);
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> tmp,int target,int[] candidates,int tmp1,int begin){
        if (tmp1 == target){
            res.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = begin; i < candidates.length; i++){
            if (tmp1 > target) break;
            tmp.addLast(candidates[i]);
            dfs(res,tmp,target,candidates,tmp1+candidates[i],i+1);
            tmp.removeLast();
        }
    }
}
