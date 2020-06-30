package Greedy;

/**
 * @program: Leetcode
 * @description: 奇数值单元格的数目
 * @author: Wanghaoyu
 * @create: 2020-06-12 11:09
 **/
public class Solution1252 {
    public int oddCells(int n, int m, int[][] indices) {
        if (n == 0 || m == 0) return 0;
        int[][] tmp = new int[n][m];
        for (int[] index : indices) {
            for (int j = 0; j < tmp[0].length; j++) {
                tmp[index[0]][j]++;
            }
            for (int j = 0; j < tmp.length; j++) {
                tmp[j][index[1]]++;
            }
        }
        int count = 0;
        for (int[] ints : tmp) {
            for (int j = 0; j < tmp[0].length; j++) {
                if (ints[j] % 2 == 1) count++;
            }
        }
        return count;
    }
}
