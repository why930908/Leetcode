package String;

import java.util.Arrays;

public class Solution242 {
    public boolean isAngram(String s,String t){
        if (s.length() != t.length())
            return false;
        int[] tmp = new int[26];
        for (int i = 0; i < s.length();i++){
            tmp[s.charAt(i) - 'a']++;
            tmp[t.charAt(i) - 'a']--;
        }
        for (int tmp1 : tmp)
            if (tmp1 != 0)
                return false;
        return true;
    }
}
