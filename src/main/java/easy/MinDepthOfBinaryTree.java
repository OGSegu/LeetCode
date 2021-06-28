package easy;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> queue = new ArrayDeque();
        queue.add(root);
        int height = 0;
        while (true) {

            int nodeCount = queue.size();

            height++;
            while (nodeCount > 0) {
                TreeNode node = queue.pop();
                if (node.left == null && node.right == null)
                    return height;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                nodeCount--;
            }
        }
    }
}
