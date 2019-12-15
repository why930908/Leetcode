package Recursion;

import java.util.List;

public class Solution779 {
    public int kthGrammar(int N, int K) {
        return Integer.bitCount(K - 1)%2;
    }
}
