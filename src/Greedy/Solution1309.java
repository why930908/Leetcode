package Greedy;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-12 14:07
 **/
public class Solution1309 {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char tmp;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == '#'){
                tmp = (char) ('a'+ Integer.parseInt(s.substring(i-2,i)) - 1);
                sb.append(tmp);
                i-=2;
            }else {
                tmp = (char) ('a' + Character.getNumericValue(s.charAt(i)) - 1);
                sb.append(tmp);
            }

        }
        return sb.reverse().toString();
    }
}
