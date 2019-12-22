package Array;
//二分法模板，必须掌握！
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0; int right = nums.length;
        while (left < right ){

            int mid = (left + right)>>1;
            if (target > nums[mid]) left = mid +1;
            else right = mid;
        }
        return right;
    }
}
