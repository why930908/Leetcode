package String;

public class Solution8 {
    public static int myAtoi(String str) {
        str=str.trim();
        int sign=1;
        if (str.length()==0) return 0;
        int start=0;
        if (str.charAt(0) == '-') {sign=-1;start++;}
        else if (str.charAt(0) == '+') {
            start++;}
        double sum =0;
        for (int i = start; i < str.length();i++){
            if (Character.isDigit(str.charAt(i))) sum = sum *10 + str.charAt(i) - '0';
            else break;
        }

        if (sum*sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sum*sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) sum*sign;
    }
    public static void main(String[] args){
        System.out.println(myAtoi("20000000000000000000"));
    }
}
