package String;

import java.util.Arrays;

public class Solution1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] word = new int[words.length];
        int j =0;
        for (String s : words){
            int count = 1;
            char min = s.charAt(0);
            for (int i = 0; i < s.length()-1;i++){
                if(s.charAt(i) < min) {
                    min = s.charAt(i);
                    count = 1;
                }else count++;
                }

            word[j] = count;
            j++;
            }


        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length;i++){
            int count = 1;
            char min = queries[i].charAt(0);
            for (j = 0; j < queries[i].length()-1;j++){
                if (queries[i].charAt(j) < min){
                    min = queries[i].charAt(j);
                    count = 1;
                }else count++;
            }
            int count2 =0;
            for (int z =0;z<word.length;z++){
                if (count < word[z]) count2++;
            }
            res[i] = count2;
        }
        return res;

    }
}
