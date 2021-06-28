package easy;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.*;

public class BinaryTreeInorder {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> result = inorderTraversal(treeNode);
        //List<Integer> result = inorderTraversal(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(result);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);
                current = node.right;
            }
        }
        return result;
    }
}
