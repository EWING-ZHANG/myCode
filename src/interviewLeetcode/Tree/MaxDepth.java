package interviewLeetcode.Tree;

import interviewLeetcode.linkedList.ListNode;
import interviewLeetcode.linkedList.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null)
            return depth;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}
