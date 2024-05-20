/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return getMinDepth(root, 0);
    }

    public int getMinDepth(TreeNode root, int depth) {
        if (root.right == null && root.left == null) return depth + 1;

        int left = root.left == null ? Integer.MAX_VALUE : getMinDepth(root.left, depth + 1);
        int right = root.right == null ? Integer.MAX_VALUE : getMinDepth(root.right, depth + 1);
        return Math.min(left, right);
    }
}