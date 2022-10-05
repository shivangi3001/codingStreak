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
//     public TreeNode addOneRow(TreeNode root, int val, int depth) {
//         if(root == null)  return root;
        
//     }
// }


// discussion vala approach
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root,val,depth,0);
        
        
    }
    public TreeNode helper(TreeNode root, int val, int depth,int flag){
        if(depth==1 && flag==0){
            TreeNode newNode=new TreeNode(val);
            newNode.left=root;
            return newNode;
        }
        if(depth==1 && flag==1){
            TreeNode newNode=new TreeNode(val);
            newNode.right=root;
            return newNode;
        }
        
        if(root.left!=null){
            root.left=helper(root.left,val,depth-1,0);
        }
        else if(root.left==null && depth==2){
            root.left=new TreeNode(val);
        }
        
        if(root.right!=null){
            root.right=helper(root.right,val,depth-1,1);
        }
        else if(root.right==null && depth==2){
            root.right=new TreeNode(val);
        }
        return root;
        
    }
    
    
}