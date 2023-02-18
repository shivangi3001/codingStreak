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

// daily leetcode challenge -> 18th Feb
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)  return root;
        
        TreeNode temp1 = root.left;
        root.left = root.right;
        root.right = temp1;      //root.right=temp2;
        invertTree(root.left);   invertTree(root.right);
        
        return root;
        
    }
}