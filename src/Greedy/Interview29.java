package Greedy;

/**
 * @program: Leetcode
 * @description: 顺时针遍历矩阵
 * @author: Wanghaoyu
 * @create: 2020-06-05 17:01
 **/
public class Interview29 {
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new int[0];
            }
            int[] res = new int[matrix.length * matrix[0].length];
            int u = 0, d = matrix.length - 1, l = 0, r = matrix[0].length - 1;
            int idx = 0;
            while (true) {
                for (int i = l; i <= r; i++) {
                    res[idx++] = matrix[u][i];
                }
                if (++u > d) {
                    break;
                }
                for (int i = u; i <= d; i++) {
                    res[idx++] = matrix[i][r];
                }
                if (--r < l) {
                    break;
                }
                for (int i = r; i >= l; i--) {
                    res[idx++] = matrix[d][i];
                }
                if (--d < u) {
                    break;
                }
                for (int i = d; i >= u; i--) {
                    res[idx++] = matrix[i][l];
                }
                if (++l > r) {
                    break;
                }
            }
            return res;
        }
    }
}
