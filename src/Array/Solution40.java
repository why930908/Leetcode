package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/6
 */
public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(candidates);
        dfs(res,new LinkedList<Integer>(),candidates,target,0,0);
        return res;
    }
    private void dfs(List<List<Integer>> res, LinkedList<Integer> tmp,int[] candidates,int target,int tmp1,int begin){
        if (tmp1 == target){
            res.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = begin; i < candidates.length; i++){
            if (target < tmp1) break;
            if (i > begin && candidates[i] == candidates[i-1])
                continue;
            tmp.addLast(candidates[i]);
            dfs(res,tmp,candidates,target,tmp1+candidates[i],i+1);
            tmp.removeLast();
        }
    }
}
