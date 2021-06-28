package training;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {

    public static void main(String[] args) {
        bfs(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
    }

    public static void bfs(TreeNode treeNode) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}
