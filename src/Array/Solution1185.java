package Array;
//date
public class Solution1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] months ={31,28,31,30,31,30,31,31,30,31,30,31};
        boolean a = false;
        int days = 4;
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (int i = 1971; i < year;i++){
            if ((i%4==0 && i%100!=0) || i%400==0)  days+=2; else days+=1;
        }
        for (int i = 0;i < month-1;i++) {
            if ((year%4==0 && year%100!=0) || year%400==0)  months[1] = 29; else months[1] = 28;
            days += months[i];
        }
        days+=day-1;
        return week[days%7];
    }
}
