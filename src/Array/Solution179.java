package Array;

import java.util.Arrays;
//sort自定义
public class Solution179 {
    public String largestNumber(int[] nums) {
        String[] res = new String[nums.length];
        for (int i =0;i<nums.length;i++){
            res[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(res,(x,y)->(y+x).compareTo(x+y));
        StringBuilder sb = new StringBuilder();
        for (String s : res){
            sb.append(s);
        }
        return sb.toString().startsWith("0") ? "0" : sb.toString();
    }
}
