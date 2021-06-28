package easy;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();

            // swap
            TreeNode nodeLeft = node.left;
            node.left = node.right;
            node.right = nodeLeft;

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }
}
