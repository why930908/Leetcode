package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @description:
 * @author: Wanghaoyu
 * @create: 2020-06-15 10:43
 **/
public class Solution1602 {
    class WordsFrequency {
        Map<String,Integer> map = new HashMap<>();
        public WordsFrequency(String[] book) {
            for (int i = 0; i < book.length; i++){
                map.put(book[i],map.getOrDefault(book[i],0) + 1);
            }
        }

        public int get(String word) {
            return map.getOrDefault(word,0);
        }
    }

}
