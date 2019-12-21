package Bitwise;
//mask^=-mask
public class Solution260 {
    public int[] singleNumber(int[] nums){
        int mask = 0;
        int[] res = new int[2];
        for (int num : nums)
            mask^=num;
        mask&=(-mask);
        for (int num : nums){
            if ((num & mask)==0) res[0]^=num;
            else res[1]^=num;
        }
        return res;
    }
}
