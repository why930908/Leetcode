package String;

public class Solution541 {
    public static String reverseStr(String s, int k) {
        int len = s.length();
        int begin = 0;
        StringBuilder res =  new StringBuilder();
        while (len >= 2*k){
            StringBuilder tmp = new StringBuilder();
            tmp.append(s.substring(begin,begin+k));
            res.append(tmp.reverse()+s.substring(begin+k,begin+2*k));
            begin+=2*k;
            len-=2*k;
        }
        if (len > k){
            StringBuilder tmp = new StringBuilder();
            tmp.append(s.substring(begin,begin+k));
            res.append(tmp.reverse()+s.substring(begin+k));
        }else {
            StringBuilder tmp = new StringBuilder();
            tmp.append(s.substring(begin));
            res.append(tmp.reverse());
        }
        return res.toString();

    }
    public static void main(String[] args){
        System.out.println(reverseStr("abcdefg",2));
    }
}
