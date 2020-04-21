package Tree;

/**
 * Created by wanghaoyu on 2020/4/20
 */
public class Solution200 {
    public int numIslands(char[][] grid){
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int i,int j){
        int row = grid.length;
        int column = grid[0].length;
        if (i < 0 || j < 0 || i >= row || j >= column || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j -1);
    }
}
