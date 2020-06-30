package offer;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-30 10:52
 **/
public class offer03 {
    //


    //先看题，该数组的元素都在0到n-1之间，这样就可以利用数组下标做文章了，遍历数组，将数组值作为下标，取反，判断是否为反即可判断重复元素。
    public int findRepeatNumber(int[] nums) {
        for (int num : nums){
            //此时的num可能为负，故必须取绝对值保证数组不越界。
            num = Math.abs(num);
            //若为负值则证明以前遍历
            if (nums[num] < 0)
                return num;
            nums[num] *= -1;
        }
        return 0;
    }
}
