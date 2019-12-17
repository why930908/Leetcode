package String;

public class Solution344 {
    public void reverseString(char[] s){
        char temp;
        int j = s.length - 1;
        for (int i = 0; i < s.length;i++){

                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
                if (i >= j) break;
            }
        }
    }

