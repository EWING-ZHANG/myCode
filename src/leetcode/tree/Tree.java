package leetcode.tree;

public class Tree {
    static int res=0;
    public static void main(String[] args) {
        //构造一棵树
        TreeNode node9 = new TreeNode(9,null,null);
        TreeNode node7 = new TreeNode(7,null,null);
        TreeNode node15 = new TreeNode(15,null,null);
        TreeNode node20 = new TreeNode(9,node15,node7);
        TreeNode node3 = new TreeNode(9,node9,node20);

        maxDepth(node3,0);

        System.out.println(res);



    }
    //二叉树的最大深度
    public static void maxDepth(TreeNode root,int depth){
        if(root==null){
            res =Math.max(res,depth);
            return;
        }
        depth++;
        maxDepth(root.left,depth);
        maxDepth(root.right,depth);
        depth--;
    }
}
class TreeNode0{
    int val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode0(){

    }
    TreeNode0(int val){
        this.val = val;
    }
    TreeNode0(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left=left;
        this.right=right;
    }

}
