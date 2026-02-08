import javax.swing.tree.TreeNode;
import java.awt.*;

public class Solution {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );

        System.out.println(isBalanced(root));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
    }


    public  static boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 &&
                isBalanced(root.left) &&
                isBalanced(root.right);

    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
