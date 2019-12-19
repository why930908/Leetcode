package Bitwise;
//bitCount
public class Solution762 {
    public int countPrimeSetBits(int L,int R){
        int[] prime ={0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,0,1,0};
        int res = 0;
        for (int i=L; i < R+1;i++){
            res+=prime[Integer.bitCount(i)];
        }
        return res;
    }
}
