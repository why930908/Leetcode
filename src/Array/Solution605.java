package Array;

public class Solution605 {
    public boolean canPlaceFlowers(int[] flowered,int n){
        if (flowered.length == 1){
            if (flowered[0] == 0) n--;
            if (n > 0) return false;
            else return true;
        }else
        if (flowered[0] == 0 && flowered[1] == 0){
            flowered[0] = 1;
            n--;
        }
        for (int i =1; i < flowered.length-1;i++){
            if (flowered[i] == 0 && flowered[i-1] == 0 && flowered[i+1] == 0){
                flowered[i] = 1;
                i++;
                n--;
            }
            if (n == 0) break;
        }
        if (flowered[flowered.length-1] == 0 && flowered[flowered.length - 2] == 0){
            flowered[flowered.length-1] = 1;
            n--;
        }
        if (n > 0) return false;
        else return true;
    }
}
