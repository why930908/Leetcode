package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//stream getorDefault
public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr){
        /*Map<Integer,Integer> map = new HashMap<>();
        for (int elem : arr){
            map.put(elem,map.getOrDefault(elem,0) + 1);
        }
        return map.size() == new HashSet<Integer>(map.values()).size();*/
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int elem : arr){
            if (map.get(elem) == null) map.put(elem,1);
            else map.put(elem,map.get(elem) + 1);
        }
        for (int elem : map.values()){
            if (!set.add(elem)) return false;
        }
        return map.values().size() == map.values().stream().distinct().count();
    }
}
