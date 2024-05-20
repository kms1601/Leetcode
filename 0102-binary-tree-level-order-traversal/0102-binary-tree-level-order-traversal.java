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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root, 0});

        if (root == null) {
            return ans;
        }

        while (!queue.isEmpty()) {
            Object[] cur = queue.poll();
            TreeNode node = (TreeNode) cur[0];
            int depth = (Integer) cur[1];
            
            if (depth == ans.size()) ans.add(new ArrayList<>());

            ans.get(depth).add(node.val);

            if (node.left != null) queue.offer(new Object[]{node.left, depth + 1});
            if (node.right != null) queue.offer(new Object[]{node.right, depth + 1});
        }
        return ans;
    }
}