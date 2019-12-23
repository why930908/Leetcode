package Array;
//面试精选
public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int min =1;
        int j =1;
        while (true) {
            for (int i = 0; i < nums.length; i++) {
                if (min == nums[i]) {
                    min++;break;
                }
            }
            j++;
            if (min != j) break;
        }
        return min;
    }
}
