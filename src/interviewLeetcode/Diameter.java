package interviewLeetcode;

import interviewLeetcode.linkedList.TreeNode;

import java.util.LinkedList;

public class Diameter {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter=0;
        if(root==null) return diameter;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                diameter=Math.max(depth(root.left)+depth(root.right),diameter);
                if(root.left!=null) queue.add(root.left);
                if(root.right!=null) queue.add(root.right);
            }
        }
        return diameter;

    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                if(root.left!=null) queue.add(root.left);
                if(root.right!=null) queue.add(root.right);
            }
            depth++;
        }
        return depth;
    }
}
