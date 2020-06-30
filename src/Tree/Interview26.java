package Tree;

/**
 * @program: Leetcode
 * @description: 判断子树
 * @author: Wanghaoyu
 * @create: 2020-06-11 17:44
 **/
public class Interview26 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int _val) {
            val = _val;
        }
    }

    public boolean isSubStructure(TreeNode A,
                                  TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return (isSubStructure(A.left, B.left) && isSubStructure(A.right, B.right)) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

}
