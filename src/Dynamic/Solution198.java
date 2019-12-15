package Dynamic;

public class Solution198 {
    public int rob(int[] nums){
        int a = 0;
        int b = 0;
        for (int num : nums){
            int temp = b;
            b = Math.max(a + num,b);
            a = b;
        }
        return b;
    }
}
