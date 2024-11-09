package interviewLeetcode.Tree;

import interviewLeetcode.linkedList.TreeNode;

import java.util.LinkedList;

public class InverseTree {
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(!list.isEmpty()){
            for (int i = 0; i < list.size(); i++) {
                root = list.poll();
                TreeNode temp = root.left;
                root.left = root.right;
                root.right=temp;
                if(root.left!=null) list.add(root.left);
                if(root.right!=null) list.add(root.right);
                String a="abc";
                a.charAt(1);
            }
        }
        return root;
    }
}
