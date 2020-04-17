package String;

import java.util.*;

/**
 * Created by wanghaoyu on 2020/4/5
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs){
        if (strs.length == 0) return new ArrayList<>();
        Map<String,List> ans = new HashMap<>();
        int[] count = new int[26];
        for (String s : strs){
            Arrays.fill(count,0);
            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26;i++){
                sb.append(count[i]);
                sb.append('#');
            }
            if (!ans.containsKey(sb.toString())) ans.put(sb.toString(),new ArrayList());
            ans.get(sb.toString()).add(s);
        }
        return new ArrayList(ans.values());
    }
}
