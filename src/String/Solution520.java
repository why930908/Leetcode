package String;

public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        for (int i =1; i < word.length();i++){
            if (word.charAt(0) >='a'&&word.charAt(0)<='z'){
                if (word.charAt(i) < 'a') return false;
                else continue;
            }else if (word.charAt(1) < 'a' ) {
                if (word.charAt(i) >= 'a') return false;
                else continue;
            }else if (word.charAt(1) >= 'a'){
                if (word.charAt(i) < 'a') return false;
                else continue;
            }
        }
        return true;
    }
}
