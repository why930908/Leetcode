package Recursion;
// %9
public class Solution258 {
    public int addDigits(int num){
        if (num == 0) return 0;
        int sum = 0;
        while (num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        while (sum >9){
           sum = f(sum);
        }
        return sum;
    }
    public int f(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}
