package Greedy;

public class Solution921 {
    public int minAddToMakeValid(String S){
        int left=0;
        int right=0;
        for (int i =0; i < S.length();i++) {
            if (S.charAt(i) == '('){
                left++;
            }else if (left >0){
                left--;
            }else right++;
        }
        return left + right;
    }
}
