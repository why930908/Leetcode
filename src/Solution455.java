import java.util.Arrays;

class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int index = 0;
        for (int i = 0; i < g.length;i++){
            for (int j = index; j < s.length;j++){
                index++;
                if (s[j] >= g[i]){
                    count++;
                    break;
                }

            }
        }
        return count;
    }
}