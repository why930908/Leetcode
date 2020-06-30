package Greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:43
 **/
public class Interview0809 {
    List<String> res;
    public  List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        dfs(n,res,new StringBuilder(),0,0);
        return res;
    }
    private static void dfs(int n, List<String> res,StringBuilder tmp, int left,int right){
        if (tmp.length() == 2 * n) {
            res.add(tmp.toString());
            return;
        }
        if (left < n) {
            dfs(n,res,tmp.append('('),left+1,right);
        }
        if (left > right){
            dfs(n,res,tmp.append(')'),left,right+1);
        }
    }

}
