package Array;

import java.util.Arrays;
import java.util.Comparator;

public class Solution905 {
    public int[] sortArrayByParity(int[] A){
        return Arrays.stream(A).boxed().sorted((a,b) -> Integer.compare(a%2,b%2)).mapToInt(i->i).toArray();
    }
}
