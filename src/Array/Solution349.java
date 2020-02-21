package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// double pointer
public class Solution349 {
    public int[] intersection(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0, j = 0;
        Set<Integer> res = new HashSet<>();
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;

            }else if (nums1[i] < nums2[j]){
                i++;
            }else j++;
        }
        int[] output = new int[res.size()];
        int idx = 0;
        for (int tmp : res)
            output[idx++]=tmp;
        return output;

    }
}
