package Array;

public class Solution414 {
    public int thirdMax(int[] nums){
        int max = nums[0];
        long two = Long.MIN_VALUE;
        long three = Long.MIN_VALUE;
        for (int i =1;i < nums.length;i++){
            if (nums[i] > max){
                three = two;
                two = max;
                max = nums[i];

            }else if (nums[i] == max) {continue;}
            else if (nums[i] > two){
                three = two;
                two = nums[i];
            }else if (nums[i] == two){continue;}
            else if (nums[i] > three){
                three = nums[i];
            }else if (nums[i] == three) continue;
        }
        if (three == Long.MIN_VALUE) return max;
        else return (int) three;
    }
}
