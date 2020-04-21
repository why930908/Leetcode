package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanghaoyu on 2020/4/20
 */
public class Solution207 {
    public boolean canFinish(int numCourses,int[][] prerequisites){
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++){
            adjacency.add(new ArrayList<>());
        }
        int flag[] = new int[numCourses];
        for (int[] cp : prerequisites){
            adjacency.get(cp[1]).add(cp[0]);
        }
        for (int i = 0; i < numCourses; i++){
            if (!dfs(adjacency,flag,i)) return false;
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adjacency,int[] flag,int i){
        if (flag[i] == 1) return false;
        if (flag[i] == -1) return true;
        flag[i] = 1;
        for (int tmp : adjacency.get(i)){
            if (!dfs(adjacency,flag,tmp)) return false;
        }
        flag[i] = -1;
        return true;
    }
}
