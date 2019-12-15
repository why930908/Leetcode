package Recursion;

public class Solution1137 {
    public int tribonacci(int n){
        int a=0, b=1, c=1;
        while (n>0){
            c = a + b + c;
            b = c - a - b;
            a = c - a - b;
            n--;
        }
        return a;
    }
}
