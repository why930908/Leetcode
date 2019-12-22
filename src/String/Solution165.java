package String;
//split \\.
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        for (int i = 0; i < Math.max(str1.length,str2.length);i++){
            int m = i<str1.length ? Integer.parseInt(str1[i]) : 0;
            int n = i<str2.length ? Integer.parseInt(str2[i]) : 0;
            if (m != n)  return m > n ? 1 : -1 ;
        }
        return 0;

    }
}
