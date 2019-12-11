package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Solution1276 {
    public List<Integer> numOfBurgers(int tomatoSlices,int cheeseSlices){
        List<Integer> res = new ArrayList<>();
        if (tomatoSlices < 2*cheeseSlices || tomatoSlices > 4*cheeseSlices || tomatoSlices%2 ==1){

        }else{
            res.add(tomatoSlices/2 - cheeseSlices);
            res.add(2*cheeseSlices - tomatoSlices/2);
        }
        return res;
        //res.add()
    }
}
