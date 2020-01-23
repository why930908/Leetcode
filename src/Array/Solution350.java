package Array;

import java.util.Arrays;

//double pointers
public class Solution350 {
    public int[] intersect(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j <nums2.length){
            if (nums1[i] == nums2[j]){
                nums1[k++] = nums2[j++];
                i++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else j++;
        }
        int[] res = new int[k];
        for (int z = 0; z < k;z++){
            res[z] = nums1[z];
        }
        return res;
    }
}
