package Greedy;

import java.util.Arrays;
import java.util.Comparator;

//  注意Array.sort的重写 从小到大排列和从大到小排列


class Solution1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0]-ints[1]-(t1[0]-t1[1]);
            }
        });
        int total = 0;
        int n = costs.length/2;
        for (int i = 0; i < n;i++){
            total+=costs[i][0]+costs[i+n][1];
        }
        return total;
    }
}

