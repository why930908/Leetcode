package String;
//substring
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String res ="";
        for (int i = 0;i < strs[0].length();i++){
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length;j++){
                if (strs[j].length() == i || c!=strs[j].charAt(i)) return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
