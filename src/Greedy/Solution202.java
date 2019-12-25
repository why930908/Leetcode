package Greedy;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (true) {
            while (n != 0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            if (sum == 1)
                return true;
            if (set.contains(sum))
                return false;
            else {
                set.add(sum);
                n = sum;
            sum =0;}
        }
    }
}
