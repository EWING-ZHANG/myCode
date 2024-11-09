package interviewLeetcode;

import interviewLeetcode.linkedList.TreeNode;

import java.util.LinkedList;

public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        TreeNode head=root.right;
        root =root.left;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while(!q.isEmpty()){
            if(q.size() != queue.size()) return false;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                head = queue.poll();
                if(!((head==null && root==null) || (head!=null && root!=null))) return false;
                if(root.val!=head.val) return false;
                q.add(root.left);
                 q.add(root.right);

                 queue.add(head.right);
                queue.add(head.left);
            }
        }
        return true;


    }
    public void traverseFromRight(TreeNode head){
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                head = queue.poll();
                if(head.right!=null) queue.add(head.right);
                if(head.left!=null) queue.add(head.left);
            }
        }
    }
    public void traverseFromLeft(TreeNode root){


    }
}
