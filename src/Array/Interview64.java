package Array;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 11:10
 **/
public class Interview64 {
    public int sumNums(int n) {
        if (n == 1) return 1;
        return n + sumNums(n-1);
    }
}
