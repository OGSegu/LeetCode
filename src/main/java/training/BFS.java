package training;

import easy.MaxDepthOfBinaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BFS {

    public static void main(String[] args) {
        List<Integer> result = bfs(new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9))));
        System.out.println(result);
    }

    public static List<Integer> bfs(TreeNode treeNode) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            result.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }

}
