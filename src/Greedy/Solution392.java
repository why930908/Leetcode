package Greedy;
//学习了String的indexof查找固定字符
    public class Solution392 {
        public boolean isSubsequence(String s,String t){
            if (s.length() > t.length())
                return false;
            int index = 0;
            for (int i = 0;i<s.length();i++){
                if (t.indexOf(s.charAt(i),index) == -1)
                    return false;
                else index = t.indexOf(s.charAt(i),index) + 1;
            }
            return true;
        }
    }
