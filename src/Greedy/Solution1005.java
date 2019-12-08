package Greedy;

import java.util.Arrays;
//此题看似简单，实则要求很多细节。
//leetcode的题解中也有简易算法，不过不好想。
class Solution1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        int result = 0;
        int index =0;
        Arrays.sort(A);
        for (int i =0; i< K;i++){
            if (A[i] < 0){
                if (i < K-1) {
                    A[i] = -A[i];
                    if (A[i + 1] < 0) continue;
                    else if (A[i + 1] == 0) break;
                    else if (A[i + 1] > 0) {
                        index = K - 1 - i; break;
                    }
                }else A[i] = -A[i];
            }else {index=K;break;}
        }
        Arrays.sort(A);
        if (index % 2 == 1){
            A[0] = -A[0];
        }
        for (int i = 0; i < A.length;i++){
            result+=A[i];
        }
        return result;
    }
}
