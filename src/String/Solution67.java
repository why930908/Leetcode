package String;
//String +
public class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int tmp = 0;
        for (int i = a.length()-1,j = b.length()-1;i>=0 || j>=0 || tmp >0;i--,j--){
            int sum =tmp;
            sum+=i>=0? a.charAt(i)-'0' : 0;
            sum+=j>=0? b.charAt(j)-'0' : 0;
            res.append(sum%2);
            tmp = sum/2;
        }
       //  res.append(tmp == 1 ? tmp : "");
        return res.reverse().toString();
    }
}
