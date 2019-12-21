package String;

import java.util.Arrays;

public class Solution522 {
    public int findLUSlength(String[] strs) {
        int max =0;
        Arrays.sort(strs,(a,b) -> a.length()>b.length());
        for (String s : strs){
            max = s.length() > max ? s.length() : max;
        }
        return max;

    }
}
