/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         using the condition of binary search tree
        if(p.val < root.val && q.val<root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(p.val > root.val && q.val >root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
//         if(root==null || root.left==null || root.right==null) return null;
        
//         else if(root.left == p && root.right ==q) return root;
        
//         else if(root==p && root.left !=null && root.right !=null) return p;
//         else if(root==q && root.left !=null && root.right !=null) return q;
        
//         root = lowestCommonAncestor(root.left,p,q);
//         root = lowestCommonAncestor(root.right,p,q);
//         return root;
    }
}