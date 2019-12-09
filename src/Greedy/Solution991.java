package Greedy;

// have fault
//X=8,Y=10
class Solution991 {
    public static  int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            ans++;
            if (Y % 2 == 1)
                Y++;
            else
                Y /= 2;
        }

        return ans + X - Y;
    }
    public static void main(String[] arg){
        System.out.println(brokenCalc(8,10));
    }
}
