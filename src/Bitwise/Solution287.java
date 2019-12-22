package Bitwise;

import java.util.HashSet;
import java.util.Set;
//二分法模板，必须掌握！
public class Solution287 {
    public int findDuplicate(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int mid = left + right+1 >>>1;
            int count = 0;
            for (int num : nums){
                if (num < mid) count++;
            }
            if (count < mid) left = mid;
            else right = mid-1;
        }
        return left;
    }
}
