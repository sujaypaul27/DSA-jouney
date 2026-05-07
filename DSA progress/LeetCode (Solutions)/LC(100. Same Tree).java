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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q != null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);

        return leftSame && rightSame;
    }
}// Time complexity: O(n) where n is the number of nodes in the trees, as we need to compare each node. Space complexity: O(h) where h is the height of the tree, due to the recursive call stack. In the worst case (skewed tree), this can be O(n).