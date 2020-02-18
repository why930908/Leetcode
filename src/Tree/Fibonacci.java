package Tree;

public class Fibonacci {
    public int fib(int n){
        int[] fi = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i =2;i <=n;i++){
            fi[i]= fi[i-1] + fi[i-2];
        }
        return fi[n];
    }
}
