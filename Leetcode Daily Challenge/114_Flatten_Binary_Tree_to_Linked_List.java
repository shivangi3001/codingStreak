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
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        
        // TreeNode prev = null;
        if(root == null)  return;
        // TreeNode prev = null;
        
        flatten(root.right);
        flatten(root.left);

        
        root.right=prev;    root.left=null;
        prev=root;
        
    }
    
//     public TreeNode helper(TreeNode root){
//         if(root == null)  return root;
        
//         TreeNode left = root;    TreeNode right = root;
        
//         if(root.left != null)     left = helper(root.left);
//         if(root.right != null)    right = helper(root.right);
        
// //      storing the TrreNode right in temp
//         TreeNode temp = right;
        
// //      pointing last child of left root to TreeNode 5
//         TreeNode lastChLeft = lastFlatten(left);
//         lastChLeft.right = temp;
        
// //      last child of left points to TreeNode right
//         root.right=left;
        
        
// //         pointing the left child of root to null
//         root.left = null;
        
//         return root;
//     }
    
//     public TreeNode lastFlatten(TreeNode last){
//         if(last == null)  return last;
//         if(last.right == null) return last;
        
//         while(last.right != null){
//             last = last.right;
//         }
//         return last;
//     }
}