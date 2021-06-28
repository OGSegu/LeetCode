package easy;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class SumOfLeftLeaves {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int result = sumOfLeftLeaves(treeNode);
        System.out.println("result = " + result);
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        int result = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                if (isLeaf(node.left)) {
                    result += node.left.val;
                } else {
                    stack.push(node.left);
                }
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return result;
    }
    static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
