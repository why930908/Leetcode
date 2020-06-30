package offer;

/**
 * @program: Leetcode
 * @description: 二维数组的查找
 * @author: Wanghaoyu
 * @create: 2020-06-30 11:26
 **/
public class offer04 {
    //从左上或者右下角开始遍历数组
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;
        int row = matrix.length-1, column = 0;
        //遍历matrix数组，其中row表示行索引，column表示列索引。
        while (row >= 0 && column <matrix[0].length){
            if (target == matrix[row][column]){
                return true;
            }
            else if (target > matrix[row][column]){
                column++;
            }
            else {
                row--;
            }
        }
        return false;
    }
}
