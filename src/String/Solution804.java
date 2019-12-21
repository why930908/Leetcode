package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character,String> map = new HashMap<>();
        char a = 'a';
        for (String ignored : new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}){
            map.put(a,ignored);
            a = (char) (a+1);
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length;i++){
            StringBuilder s = new StringBuilder();
            for (char b : words[i].toCharArray()){
                s.append(map.get(b));
            }
            set.add(s.toString());
        }
        return set.size();
    }
}
