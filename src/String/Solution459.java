package String;
//s+s see the difference
public class Solution459 {
    public static boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,2*s.length()-1).contains(s);
    }
    public static void main(String[] args){
        System.out.println(repeatedSubstringPattern("ababab"));
    }
}
