package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/6
 */
public class Solution216 {
    public List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> res = new LinkedList<>();
        dfs(res,new LinkedList<Integer>(),k,n,0,1);
        return res;
    }
    private void dfs(List<List<Integer>> res,LinkedList<Integer> tmp,int k,int n,int tmp1,int begin){
        if (tmp.size() > k) return;
        if (tmp1 == n && tmp.size() == k){
            res.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = begin; i <= 9; i++){
            if (tmp1 > n) break;
            tmp.addLast(i);
            dfs(res,tmp,k,n,tmp1+i,begin+1);
            tmp.removeLast();
        }
    }
}
