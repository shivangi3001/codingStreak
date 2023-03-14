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
//  leetcode daily challenge - 14th March 2023
// Runtime: 0 ms      Beats: 100%

// dfs approach
class Solution {
    public int sumNumbers(TreeNode root) {
        int[] total = new int[1];
        total[0] = 0;
        helper(root, 0, total);
        return total[0];
    }

    public static void helper(TreeNode root, int sum, int[] total){
        if(root == null) return;

        sum = sum*10 + root.val;
        if(root.left == null && root.right == null){
            total[0] = total[0]+sum;
            return;
        }
        helper(root.left, sum, total);
        helper(root.right, sum, total);
    }
}