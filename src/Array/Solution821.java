package Array;

public class Solution821 {
    public int[] shortestToChar(String S, char C) {
        int[] left = new int[S.length()];
        int[] right = new int[S.length()];
        int[] res = new int[S.length()];
        int temp = 0;
        for (int i = 0; i < S.length();i++){
            if (S.charAt(i) == C){
                for (int j = temp; j <= i;j++){
                    left[j] = i - j;
                }
                temp = i + 1;
            }
        }
        return res;
    }
}
