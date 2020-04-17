package LinkedList;

/**
 * Created by wanghaoyu on 2020/4/17
 */
//双指针
public class Solution27 {
        public int removeElement(int[] nums, int val) {
            if (nums.length == 0)
                return 0;
            int j = 0;
            for (int i = 0; i < nums.length;i++){
                while (i < nums.length && nums[i] == val){
                    i++;
                }
                if (i < nums.length)
                nums[j++] = nums[i];
            }
            return j+1;
        }
}
