package String;

import java.util.HashMap;
import java.util.Map;
//滑动窗口
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left=0;
        int max=0;
        for (int i=0;i < s.length();i++){
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
