package String;

public class Solution942 {
    public int[] diStringMatch(String S) {
        int sLen = S.length();
        int max = sLen;
        int min = 0;
        int[] res = new int[sLen+1];
        for (int i = 0; i < sLen;i++){
            if (S.charAt(i) == 'I'){
                res[i] = min++;
            }
            else {
                res[i] = max--;
            }
        }
        res[sLen] = max;
        return res;
    }
}
