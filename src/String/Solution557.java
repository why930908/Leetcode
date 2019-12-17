package String;
//StringBuilder StringBuffer trim
public class Solution557 {
    public String reverseWords(String s){
        StringBuilder sb = new StringBuilder();
        String words[] = s.split(" ");
        for (String word : words){
            sb.append(new StringBuffer(word).reverse() + " ");
        }
        return sb.toString().trim();
    }
}
