package leetcodeCompetition;

import java.util.HashSet;
import java.util.Set;

//168week
public class Solution5293 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int res = 0;
        for (int i = minSize; i <= maxSize;i++){
            for (int j =0; j < s.length()-i;j++){
                int count = 1;
                Set<Character> set = new HashSet<>();
                String str =s.substring(j,j+i);
                for (char c : str.toCharArray()){
                    set.add(c);
                }
                if (set.size()>maxLetters) continue;
                else {
                    while (true) {
                        //表示str在string.indexof第一次出现的位置
                        int index = s.indexOf(str);
                        // 注意为-1，不是0
                        if (index != -1) {
                            // index+str.length(),表示str出现的count次数，string.length()表示在字符串的长度内
                            s = s.substring(index + 1, s.length());
                            count++;
                        } else {
                            break;
                        }
                    }
                    res = Math.max(res,count);
                }
            }

        }
        return res;
    }
}
