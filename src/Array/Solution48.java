package Array;

/**
 * Created by wanghaoyu on 2020/4/5
 */
public class Solution48 {
    public void rotate(int[][] matrix){
        for (int i = 0; i < matrix.length;i++){
            for (int j = i; j < matrix[0].length;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[0].length/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-j-1] = tmp;
            }
        }
    }
}
