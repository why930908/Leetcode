package Dynamic;

public class Solution1281 {
    public int subtractProductAndSum(int n) {
        if (n == 0) return 0;
        int sum = 0;
        int product = 1;
        while (n > 0){
            sum = sum + n%10;
            product = product * (n%10);
            n = n/10;
        }
        return product - sum;
    }
}
