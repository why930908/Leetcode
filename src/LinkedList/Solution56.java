package LinkedList;

import java.util.Arrays;

/**
 * Created by wanghaoyu on 2020/4/17
 */
//自定义排序
public class Solution56 {
    public int[][] merge(int[][] intervals){
        if (intervals.length == 0)
            return null;
        Arrays.sort(intervals,(ints, t1) -> ints[0] - t1[0]);
        // 遍历区间
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval: intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                // 反之将当前区间合并至结果数组的最后区间
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
