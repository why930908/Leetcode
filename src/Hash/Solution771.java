package Hash;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char i : J.toCharArray())
            set.add(i);
        for (int j = 0; j < S.length(); j++)
            if (set.contains(S.charAt(j)))
                count++;
        return count;
    }
}
