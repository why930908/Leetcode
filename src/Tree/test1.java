package Tree;

public class test1 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int _val){ val = _val;}
    }
    public TreeNode reBuildBinaryTree(int[] pre,int [] in){
        TreeNode root = reBuildBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }

    private TreeNode reBuildBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if (startPre > endPre){
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn;i<=endIn;i++){
            if (in[i] == pre[startPre]){
                root.left = reBuildBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right = reBuildBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;
    }
}
