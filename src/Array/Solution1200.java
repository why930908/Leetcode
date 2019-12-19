package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1;i++){
            min = Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1;i++){
            if (Math.abs(arr[i]-arr[i+1]) == min){
                List<Integer> list2 = new ArrayList<>();
                list2.add(arr[i]);
                list2.add(arr[i+1]);
                list.add(list2);
            }
        }
        return list;
    }
}
