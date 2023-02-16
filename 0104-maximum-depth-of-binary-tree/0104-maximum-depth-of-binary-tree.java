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
// class Solution {
//     public int maxDepth(TreeNode root) {
// //         base case when(root == null)
//         if(root == null)  return 0;
        
//         int he=0;
// // recursion --> faith & expectation 
//         if(root.left != null) he = Math.max(he,maxDepth(root.left));
//         if(root.right != null) he = Math.max(he,maxDepth(root.right));
//         return he+1;
        
//     }
// }


// approach 2 
class Solution {
    public int maxDepth(TreeNode root) {
//         base case when(root == null)
        if(root == null)  return 0;
        
// recursion --> faith & expectation 
        int lh=0,rh=0;
        if(root.left != null) lh = maxDepth(root.left);
        if(root.right != null) rh = maxDepth(root.right);
        return 1+Math.max(lh,rh);
        
    }
}