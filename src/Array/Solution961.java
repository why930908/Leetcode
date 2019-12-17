package Array;

import java.util.HashSet;
import java.util.Set;
//空间复杂度1
public class Solution961 {
    public int repeatedTimes(int[] A){
        for (int k = 1; k < 4;k++){
            for (int i = 0; i < A.length-k;i++){
                if (A[i] == A[i+k]) return A[i];
            }
        }
        throw null;
    }
}
