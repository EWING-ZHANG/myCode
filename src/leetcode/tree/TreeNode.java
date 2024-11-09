package leetcode.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    static int  res=0;
    static int depth=0;
    static int flag=0;
//--------------------main函数----------------------
    public static void main(String[] args) {
        //定义一个树
        TreeNode node9 = new TreeNode(9,null,null);
        TreeNode node7 = new TreeNode(7,null,null);
        TreeNode node15 = new TreeNode(15,null,null);
        TreeNode node20 = new TreeNode(20,node15,node7);
        TreeNode node3 = new TreeNode(3,node9,node20);
        TreeNode root = node3;
//        Solution s = new Solution();
//        System.out.println(s.maxDepth(root));
//        bfsTree(root);
//        bfsDepthTree(root);
        //最大直径
//        maxDTree(root);
////        System.out.println(res);
//        System.out.println(traverseSearch(root,node15,node7));
        DfsDepth(root);
        System.out.println(res);
//        traverseNode(root,node7);
//        System.out.println(flag==1);
        System.out.println(node7.hashCode());
        System.out.println(node3.hashCode());

    }
    //1.深度优先遍历
    public static void dfsTree(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        dfsTree(root.left);
        dfsTree(root.right);

    }
    //2.广度优先遍历 需要放到一个队列里面
    public static void bfsTree(TreeNode root){
        List<TreeNode> list= new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){

            TreeNode node = list.remove(0);
            System.out.println(node.val);
            if(node.left!=null) list.add(node.left);
            if(node.right!=null) list.add(node.right);

        }

    }
    //3广度优先的遍历得到深度 则需要只存放当前层的节点
    public static int bfsDepthTree(TreeNode root){
        List<TreeNode> list= new LinkedList<>();
        list.add(root);
        int depth=0;
        if(root==null) return 0;
        while(!list.isEmpty()){
            int size = list.size();
            depth+=1;
            for (int i = 0; i < size; i++) {
                TreeNode node = list.remove(0);
                if(node.left!=null) list.add(node.left);
                if(node.right!=null) list.add(node.right);
            }
        }
        return depth;

    }
    //深度优先遍历得到树的深度depth
    public static void DfsDepth(TreeNode root){
        if(root==null){
            res = Math.max(res,depth);
            return;
        }
        depth++;
        DfsDepth(root.left);
        DfsDepth(root.right);
        depth--;

    }
    //最大直径
    public static void maxDTree(TreeNode root) {
        if(root==null) return;
        int left =bfsDepthTree(root.left);
        int right=bfsDepthTree(root.right);
        res=Math.max(left+right,res);
        maxDTree(root.left);
        maxDTree(root.right);


    }
    //查看root节点是否是p q两个节点的公共祖先 dfs
    public static boolean traverseSearch(TreeNode root, TreeNode p,TreeNode q){
        // if(root==null) return false;
        // boolean left = traverse(root.left,p,q);
        // boolean right =traverse(root.right,p,q);
        // return left&&right;
        //dfs
        int count=0;
        List<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        while(!list.isEmpty()){
            TreeNode node = list.remove(0);
            if(node.val==p.val || node.val==q.val){
                count++;
            }
            if(node!=null){
                if(node.left!=null) list.add(node.left);
                if(node.right!=null) list.add(node.right);
            }
        }
        return count==2?true:false;


    }
    //bfs查看root节点是否是p q两个节点的公共祖先
    public static boolean traverseSearchDfs(TreeNode root, TreeNode p,TreeNode q){
        return false;
    }
    public static void traverseNode(TreeNode root,TreeNode node){
        if(root==null) return;
        if(root.val==node.val){
            flag=1;
            return;
        }
        traverseNode(root.left,node);
        traverseNode(root.right,node);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            int size = list.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = list.remove(0);
                temp.add(node.val);
                if(node.left!=null) list.add(node.left);
                if(node.right!=null) list.add(node.right);
                list.toArray();
            }
            res.add(temp);
        }
        return res;

    }
}

class Solution {
    int res = 0;

    public int maxDepth(TreeNode root) {
        depth(root,0);
        return res;
    }

    public void depth(TreeNode root, int depth) {
        if (root==null) {
            res = Math.max(res, depth);
            return;
        }
        depth++;
        depth(root.left, depth);
        depth(root.right, depth);
        depth--;
    }
}