package Array;

/**
 * Created by wanghaoyu on 2020/4/2
 */
public class Solution289 {
    public void gameOfLife(int[][] board){
        int[] neighbors = {0,1,-1};
        int row = board.length;
        int column = board[0].length;
        int[][] ans = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                ans[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                int neighbor = 0;
                for (int x = 0; x < 3; x++){
                    for (int y =0; y < 3; y++){
                        int a = i + neighbors[x];
                        int b = j + neighbors[j];
                        if (a >= 0 && a < row && b >= 0 && b < column){
                            if (ans[a][b] == 1)
                                neighbor++;
                        }
                    }
                }
                if (ans[i][j] == 1 && neighbor < 2){
                    board[i][j] = 0;
                }
                if (ans[i][j] == 1 && neighbor > 3){
                    board[i][j] = 0;
                }
                if (ans[i][j] == 0 && neighbor == 3){
                    board[i][j] = 1;
                }
            }
        }
    }
}
