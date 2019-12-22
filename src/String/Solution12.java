package String;

import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    public String intToRoman(int num) {
            String[] str = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
            int[] i = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
            int len = i.length;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = len-1; j >= 0;j--){
                while (num >= i[j]){
                    stringBuilder.append(str[j]);
                    num-=i[j];
                }
            }
            return stringBuilder.toString();
    }
}
