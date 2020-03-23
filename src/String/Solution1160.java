package String;

import java.util.HashMap;
import java.util.Map;

public class Solution1160 {
    public int countCharacters(String[] words,String chars){
        HashMap<Character,Integer> chars_count = new HashMap<>();
        int ans = 0;
        for (char c : chars.toCharArray()){
            chars_count.put(c,chars_count.getOrDefault(c,0)+1);
        }
        for (String word : words){
            HashMap<Character,Integer> word_count = new HashMap<>();
            for (char c : word.toCharArray()){
                word_count.put(c,word_count.getOrDefault(c,0)+1);
            }
            boolean is_ans = true;
            for (char c : word.toCharArray()){
                if (word_count.getOrDefault(c,0) > chars_count.getOrDefault(c,0)){
                    is_ans = false;
                    break;
                }
            }
            if (is_ans){
                ans+= word.length();
            }
        }
        return ans;
    }
}
