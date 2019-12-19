package String;

import java.util.HashMap;
import java.util.Map;

public class Solution1160 {
    public static  int countCharacters(String[] words,String chars){
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < chars.length();i++){
            map2.put(chars.charAt(i),map2.getOrDefault(chars.charAt(i),0)+1);
        }
        int sum = 0;
        for (String s1 : words){
            boolean a = true;
            HashMap<Character,Integer> map1 = (HashMap<Character, Integer>) ((HashMap<Character, Integer>) map2).clone();
            for (char s2 : s1.toCharArray()){
                map1.put(s2,map1.getOrDefault(s2,0)-1);
                if (map1.get(s2) == -1){
                    a = false;
                    break;
                }
            }
            if (a) sum+=s1.length();
        }
        return sum;
    }
    public static void main (String[] args){
        String[] word = new String[]{"cat","bat"};
        System.out.println(countCharacters(word,"hatch"));
    }
}
