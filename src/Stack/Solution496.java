package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//单调栈
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*int[] res = new int[nums1.length];
        for (int z =0; z < nums1.length;z++){
            for (int i = 0; i < nums2.length;i++){
                if (nums2[i] == nums1[z]){
                    if (i == nums2.length - 1) res[z] = -1;
                    else {
                        for (int j = i + 1; j < nums2.length; j++) {
                            if (nums2[j] > nums2[i]) {
                                res[z] = nums2[j];
                                break;
                            }
                            if (j == nums2.length - 1 && nums2[j] <= nums2[i]) res[z] = -1;
                        }
                    }

                }
            }
        }
        return res;*/
        Stack < Integer > stack = new Stack < > ();
        HashMap < Integer, Integer > map = new HashMap < > ();
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek())
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }
        while (!stack.empty())
            map.put(stack.pop(), -1);
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
