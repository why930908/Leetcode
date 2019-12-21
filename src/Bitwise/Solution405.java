package Bitwise;

public class Solution405 {
    public String toHex(int num){
        if (num==0) return "0";
        String hex = "0123456789abcdef",res="";
        while (num!=0){
            res=hex.charAt(num&0xf)+res;
            num>>>=4;
        }
        return res;
    }
}
