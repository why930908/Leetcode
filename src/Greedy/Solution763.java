package Greedy;
import java.util.ArrayList;
import java.util.List;

//review
public class Solution763 {
    public List<Integer> partitionLabels(String S){
        int anchor = 0;
        int j =0;
        int [] last = new int[26];
        for (int i = 0; i < S.length();i++){
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < S.length();i++){
            j = Math.max(j,last[S.charAt(i) - 'a']);
            if (i == j){
                anchor = i + 1;
                ans.add(j - anchor + 1);
            }
        }
        return ans;
    }
}
