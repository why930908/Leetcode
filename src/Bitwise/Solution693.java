package Bitwise;
// n^(n>>!) or n%2 n/=2
public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        n = ( n ^ (n>>1));
        return (n&(n+1))==0;
    }
}
