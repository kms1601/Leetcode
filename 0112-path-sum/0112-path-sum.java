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

import java.util.*;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> sumList = new ArrayList<>();
        if (root == null) {
            return false;
        }

        dfs(root, sumList, 0);

        for (int i : sumList) {
            if (i == targetSum) {
                return true;
            }
        }

        return false;
    }

    public void dfs(TreeNode cur, List<Integer> sumList, int sum) {
        sum += cur.val;
        if (cur.left == null && cur.right == null) {
            sumList.add(sum);
            return;
        }

        if (cur.left != null) {
            dfs(cur.left, sumList, sum);
        }

        if (cur.right != null) {
            dfs(cur.right, sumList, sum);
        }
    }
}