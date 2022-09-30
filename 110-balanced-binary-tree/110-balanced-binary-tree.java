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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(height(root)==-1) return false;
        return true;
    }
    
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        if(lh==-1 || rh==-1)  return -1;
        if(Math.abs(lh-rh)>1) return -1;
        
        return Math.max(lh,rh) +1;
    }
}

// my code---failed for this testcase ---  [5,1,6,null,2,null,null,null,3,null,4]
// output--t    expected---f
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null) return true;
        
//         Boolean flag=true;
//         System.out.println(root.val);
//         if(check(root) != -1){
//             if(root.left != null)  flag = isBalanced(root.left);
//             if(root.right != null) flag = isBalanced(root.right);
//             return flag;
//         }
//         return false;
//     }
    
//     public int check(TreeNode root){
//         if(root == null) return 0;
        
//         int lh=0,rh=0;
//         if(root.left != null)  lh = check(root.left);
//         if(root.right != null) rh = check(root.right);
//         System.out.println("lh-->"+lh+"--rh-->"+rh);
//         if(Math.abs(lh-rh)>1) return -1;
//         return 1+ Math.max(lh,rh);
//     }
// }

// tried another recursive approach
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null)  return true;
//         // if(root.left == null && root.right)
//         // System.out.println("root->"+root.val+"left->"+height(root.left)+"->"+height(root.right));
//         return Math.abs(height(root.left) - height(root.right)) < 2;
//     }
    
//     public int height(TreeNode root){
//         if(root == null) return -1;
//         int he = 1 + Math.max(height(root.left), height(root.right));
//         return he;
//     }
// }