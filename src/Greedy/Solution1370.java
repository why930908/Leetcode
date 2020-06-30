package Greedy;

/**
 * @program: Leetcode
 * @description: 上升下降字符串
 * @author: Wanghaoyu
 * @create: 2020-06-12 17:53
 **/
public class Solution1370 {
        public String sortString(String s) {
            int[] count = new int[26];
            for(char c : s.toCharArray())
                count[c - 'a'] += 1;
            StringBuilder res = new StringBuilder();
            while(res.length() != s.length()){
                for(int i = 0; i < 26; i++){
                    if(count[i] == 0)
                        continue;
                    res.append((char)(i + 'a'));
                    count[i] -= 1;
                }
                for(int i = 25; i >= 0; i--){
                    if(count[i] == 0)
                        continue;
                    res.append((char)(i + 'a'));
                    count[i] -= 1;
                }
            }
            return res.toString();
        }

}
