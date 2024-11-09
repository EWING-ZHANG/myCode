package interviewLeetcode.Tree;

import interviewLeetcode.linkedList.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 迭代的中序遍历
 *     1
 *    /\
 *   2  3
 *  /\  \
 * 4 6  5
 * \
 * 7
 */
public class Traverse {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode.left=treeNode2;
        treeNode.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode3.right=treeNode5;
        treeNode2.right=treeNode6;
        treeNode4.right=treeNode7;
        traverse(treeNode);





    }
    public static void traverse(TreeNode root){
        //先根节点 这个return就是打破递归？？
        if(root==null) return;
        System.out.println(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    public static void BFS(TreeNode head){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        queue.add(head);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }

    }
    public static ArrayList<Integer>  middle(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            res.add(pop.val);
            root = root.right;

        }
        return res;

    }

}
