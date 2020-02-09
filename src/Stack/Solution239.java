package Stack;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int lenth = nums.length;
        if (lenth*k == 0) return new int[0];
        if (k == 1) return nums;
        return nums;
    }
}
