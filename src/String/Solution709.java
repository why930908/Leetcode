package String;

import java.util.HashMap;
import java.util.Map;

public class Solution709 {
    public String toLowerCase(String str){
        Map<Character,Character> map = new HashMap<>();
        for (char a : "ABCDEFGHIJKLMNOPQRSTUWVXYZ".toCharArray()){
            map.put(a, (char) (a+32));
        }
        StringBuilder res = new StringBuilder();
        for (char a : str.toCharArray()){
            res.append(map.getOrDefault(a, a));
        }
        return res.toString();
    }
}
