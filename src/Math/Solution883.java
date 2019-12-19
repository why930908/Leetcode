package Math;

public class Solution883 {
    public int projectionArea(int[][] grid){
        int sum=0;
        int max1 = grid[0][0];
        int max2 = grid[0][0];
        for (int i =0; i < grid.length;i++){
            max1 = 0;
            max2 = 0;
            for (int j =0; j < grid[0].length;j++){
                if (grid[i][j] > 0) sum++;
                max1 = Math.max(max1,grid[i][j]);
                max2 = Math.max(max2,grid[j][i]);
            }
            sum+=max1;
            sum+=max2;
        }
        /*for (int j =0; j < grid[0].length;j++){
            max2 = 0;
            for (int i = 0; i < grid.length;i++){
                max2 = Math.max(max2,grid[i][j]);
            }
            sum+=max2;
        }*/
        return sum;
    }
}
