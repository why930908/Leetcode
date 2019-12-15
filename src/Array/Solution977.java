package Array;

import java.util.Arrays;
//双指针
public class Solution977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length;i++)
            A[i] = A[i] * A[i];
        Arrays.sort(A);
        return A;
    }
}
