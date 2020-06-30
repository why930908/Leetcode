package offer;

/**
 * @program: Leetcode
 * @description: 替换空格
 * @author: Wanghaoyu
 * @create: 2020-06-30 10:49
 **/
public class offer05 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c == ' '){
                sb.append("%20");
            }else sb.append(c);
        }
        return sb.toString();
    }
}
