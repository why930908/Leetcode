package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution260 {
    public static String singleNumber(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums){
            if (!set.add(i)) set.remove(i);

        }
        int[] res = new int[set.size()];
        for (int i = 0; i < set.size();i++) break;
    return String.valueOf(set);
    }
    public static void main(String arg[]){
        System.out.println(singleNumber(new int[3]));
    }
}
