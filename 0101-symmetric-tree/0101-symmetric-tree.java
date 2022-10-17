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

// testcases---[1,2,2,3,4,4,3]
// [1,2,2,null,3,null,3]
// [1,2,2,2,null,2]

// my approach---failed for this testcase  [1,2,2,2,null,2]
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         List<Integer> LrR = new ArrayList<>();
//         List<Integer> RrL = new ArrayList<>();
        
//         helperL(root, LrR);
//         helperR(root,RrL);
//         System.out.println(LrR+"-> "+RrL);
//         if(LrR.equals(RrL)) return true;
//         return false;
//     }
    
//     void helperL(TreeNode root, List<Integer>l1){
//         if(root == null) return;
        
//         helperL(root.left, l1);
//         l1.add(root.val);
//         helperL(root.right, l1);
//     }
    
//         void helperR(TreeNode root, List<Integer>l1){
//         if(root == null) return;
        
//         helperR(root.right, l1);
//         l1.add(root.val);
//         helperR(root.left, l1);
//     }
// }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null || right ==null) return (left==right);
        if(left.val != right.val)  return false;
        
        return helper(left.left, right.right) &&  helper(left.right, right.left);
    }
}