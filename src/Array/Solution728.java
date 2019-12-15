package Array;

import java.util.ArrayList;
import java.util.List;
//获取一个整数的每一位
public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for (int i = left;i < right + 1;i++){
            if (f(i))
                res.add(i);

        }
        return res;
    }
    public boolean f(int i){
        int temp2 = i;
        while (i > 0){
            int temp = i % 10;
            if (temp == 0 || temp2%temp>0) return false;
            i = i / 10;
        }
        return true;
    }
}
