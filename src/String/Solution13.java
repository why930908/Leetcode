package String;

public class Solution13 {
    public int romanToInt(String s){
        int sum = 0;
        char[] tmp = new char[s.length()+1];
        for (int i = 0;i< s.length();i++)
            tmp[i] = s.charAt(i);
        tmp[s.length()] = 'Z';
        for (int i =0; i < s.length();i++){
            if (s.charAt(i) == 'M') sum+=1000;
            if (s.charAt(i) == 'D') sum+=500;
            if (s.charAt(i) == 'C'){
                if (tmp[i+1] == 'D') {sum+=400;i++;}
                else if (tmp[i+1] == 'M') {sum+=900;i++;}
                else sum+=100;
            }
            if (s.charAt(i) == 'L') sum+=50;
            if (s.charAt(i) == 'X'){
                if (tmp[i+1] == 'L') {sum+=40;i++;}
                else if (tmp[i+1] == 'C') {sum+=90;i++;}
                else sum+=10;
            }
            if (s.charAt(i) == 'V') sum+=5;
            if (s.charAt(i) == 'I'){
                if (tmp[i+1] == 'V') {sum+=4;i++;}
                else if (tmp[i+1] == 'X') {sum+=9;i++;}
                else sum+=1;
            }
        }
        return sum;
    }
}
