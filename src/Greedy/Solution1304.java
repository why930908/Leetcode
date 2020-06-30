package Greedy;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-12 15:36
 **/
public class Solution1304 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if (n % 2 == 0){
            int count = 1;
            for (int i = 0; i < n;i++){
                res[i] = count;
                if (i % 2 == 0) count = -count;
                else {
                    count = (-count) + 1;
                }
            }
        }else {
            int count = 1;
            for (int i = 0; i < n-1;i++){
                res[i] = count;
                if (i % 2 == 0) count = -count;
                else {
                    count = (-count) + 1;
                }
            }
            res[n-1] = 0;
        }
        return res;
    }
}
