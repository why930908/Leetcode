package String;

public class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        int a1=0,a2=0,b1=0,b2=0,index=0;
        for (int i =0; i < a.length();i++){
            if (a.charAt(i) == '+') {
                a1=Integer.parseInt(a.substring(0,i));
                a2=Integer.parseInt(a.substring(i+1,a.length()-1));
            }
        }
        for (int i =0; i < b.length();i++){
            if (b.charAt(i) == '+') {
                b1=Integer.parseInt(b.substring(0,i));
                b2=Integer.parseInt(b.substring(i+1,b.length()-1));
            }
        }
        return Integer.toString(a1*b1-a2*b2)+'+'+ (a2 * b1 + a1 * b2) +'i';
    }
}
