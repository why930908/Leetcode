package Bitwise;

public class Solution191 {
    public int hamminWeight(int n){
        int res = 0;
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
