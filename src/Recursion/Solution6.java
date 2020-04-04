package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/4
 */
public class Solution6 {
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        helper(res,"",0,0,n);
        return res;
    }
    public void helper(List<String> res,String cur,int left,int right,int max){
        if (cur.length() == max * 2){
            res.add(cur);
            return;
        }
        if (left < max){
            helper(res,cur + "(",left+1,right,max);
        }
        if (right < left){
            helper(res,cur + ")",left,right+1,max);
        }
    }
}
