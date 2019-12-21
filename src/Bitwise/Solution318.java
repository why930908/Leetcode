package Bitwise;

public class Solution318 {
    public int maxProduct(String[] words){
        int[] word = new int[words.length];
        for (int i =0;i < words.length;i++){
            for (int j =0; j < words[i].length();j++){
                word[i]|=1<<(words[i].charAt(j)-'a');
            }
        }
        int max =0;
        for (int i =0; i < word.length-1;i++){
            for (int j =i+1; j < word.length;j++){
                if ((word[i] & word[j]) == 0)
                    max = Math.max(max,words[i].length()*words[j].length());
            }
        }
        return max;
    }
}
