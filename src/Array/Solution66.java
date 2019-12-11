package Array;

public class Solution66 {
    public int[] plusOne(int[] digits){
        int last = digits.length - 1;
        while (digits[last] == 9 && last > 0){
            digits[last] = 0;
            last--;
        }
        if (last == 0 && digits[last] == 9){
            digits[last] = 0;
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            for (int i =1; i< digits.length+1; i++){
                ans[i]=0;
            }
            return ans;
        }else {
            digits[last]++;
            return  digits;
        }

    }
}
