package Greedy;

/**
 * @program: Leetcode
 * @description: 汉明距离
 * @author: Wanghaoyu
 * @create: 2020-06-11 18:32
 **/
public class Solution461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int res = 0;
        while (xor != 0){
            xor = xor & (xor - 1);
            res++;
        }
        return res;
    }
}
