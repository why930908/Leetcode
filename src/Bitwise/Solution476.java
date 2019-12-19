package Bitwise;

public class Solution476 {
    public int findComplement(int num){
        int tmp = num;
        int tmp2 =1;
        while (num > 0){
            num>>=1;
            tmp2<<=1;
        }
        tmp2-=1;
        return ~tmp;
    }
}
