package Greedy;

//review !!!
public class Solution134 {
    public int canCompleteCircuit(int[] gas,int[] cost){
        int totol = 0;
        int current = 0;
        int anchor = 0;
        for (int i = 0; i < gas.length;i++){
            current = current + gas[i] - cost [i];
            totol+=gas[i] - cost[i];
            if (current < 0){
                current = 0;
                anchor = i + 1;
            }
        }
        return totol >= 0? anchor: -1;
    }
}
