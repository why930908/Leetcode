package BinarySearch;
//面试精选
public class Solution69 {
    public int sqrt(int x){
        long left = 0;
        long right = x;
        while (left < right){
            long index =(left + right +1)>>>1;
            if (index * index > x ){
                right = index -1;
            }else left = index;
        }
        return (int)left;
    }
}
