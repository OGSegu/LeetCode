package easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxDepthOfBinaryTree {

    public static void main(String[] args) {
        int result = maxDepthRecursive(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(result);
    }


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    // Iterative
    public static int maxDepthIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int height = 0;
        while (true) {
            int nodeCount = queue.size();
            if (nodeCount == 0) {
                return height;
            }
            height++;
            while (nodeCount > 0) {
                TreeNode node = queue.pop();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                nodeCount--;
            }
        }
    }

    // Recursive
    public static int maxDepthRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right)) + 1;
    }
}
