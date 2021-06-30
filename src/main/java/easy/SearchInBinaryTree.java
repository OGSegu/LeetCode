package easy;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.*;

public class SearchInBinaryTree {

    public static void main(String[] args) {
        TreeNode result = searchBST(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))), 20);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode poppedNode = queue.pop();
            if (val == poppedNode.val)
                return poppedNode;
            if (poppedNode.left != null) {
                queue.push(poppedNode.left);
            }
            if (poppedNode.right != null) {
                queue.push(poppedNode.right);
            }
        }
        return null;
    }
}
