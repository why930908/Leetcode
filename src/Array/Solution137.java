package Array;

import java.util.HashMap;
import java.util.Map;

public class Solution137 {
    public int singleNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int elem : nums){
            if (map.get(elem) == null) map.put(elem,1);
            else map.put(elem,map.get(elem) + 1);
        }
        for (int elem : map.keySet())
            if (map.get(elem) == 1) return elem;
        throw null;
    }
}
