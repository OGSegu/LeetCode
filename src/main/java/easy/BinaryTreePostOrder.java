package easy;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.*;

public class BinaryTreePostOrder {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result = postorderTraversal(treeNode);
        System.out.println(result);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> output = new ArrayDeque<>();

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.push(node);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        while (!output.isEmpty()) {
            result.add(output.pop().val);
        }
        return result;
    }
}
