package leetcode.tree;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        //先序 先访问根节点
        //中序 左->根—>右
        //后序 左->右->根
        TreeNode node1= new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3 =new TreeNode(3);
        TreeNode node4 =new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode root = node4;
        root.left=node2;
        node2.left=node1;
        node2.right=node3;
        root.right=node5;
//        node5.left=node4;//之前导致循环的关键点 树的建立出现问题
        node5.right=node6;
        System.out.println("------------------middle-------------");
        middle(root);
        System.out.println("------------------front------------");
        front(root);
        System.out.println("------------------bfs---------------- ");
        bfs(root);

    }
    public static void middle(TreeNode root){
        //将所有节点一顿压栈 为空了再访问根节点然后右节点 前 根 后
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;

            }
            root=stack.pop();
            System.out.println(root.val);
            root=root.right;

        }
    }
    public static void front(TreeNode root){
        if(root==null) return ;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();//关键问题
            System.out.println(root.val);
            if(root.right!=null) stack.push(root.right);
            if(root.left!=null) stack.push(root.left);

        }
    }
    public static void bfs(TreeNode root){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.println(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
    }
}
