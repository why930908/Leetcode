package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/6
 */
public class Solution77 {
    public List<List<Integer>> combine(int n,int k){
        List<List<Integer>> res = new ArrayList<>();
        helper(n,k,res,new ArrayList<Integer>(),0);
        return res;
    }
    private void helper(int n,int k,List<List<Integer>> res,ArrayList<Integer> tmp,int len){
        if (tmp.size() == k){
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        for (int i=len; i < n; i++){

            tmp.add(i+1);
            helper(n,k,res,tmp,len+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
