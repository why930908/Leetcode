package Math;
//prime
public class Solution204 {
    public int countPrimes(int n) {
        boolean[] booleans = new boolean[n];
        for (int i = 2; i < n ;i++){
            if (!booleans[i]){
                for (int j = 2 * i; j < n;j+=i){
                    booleans[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n ; i++){
            if (!booleans[i])
                count++;
        }
        return count;
    }
}
