// testcases---
// [5,4,8,11,null,13,4,7,2,null,null,null,1]
// 22
// [1,2,3]
// 5
// []
// 0
// [1,2]
// 1
// [-2,null,-3]
// -2

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
// // my approach....failed for few tescases
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if(root == null) return false;
//         else if(root.left == null && root .right == null){
//             if(root.val == targetSum) return true;
//             return false;
//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         int sum=0;
//         helper(root, list, sum, targetSum);
//         list.remove(list.size()-1);
//         System.out.println(list);
//         if(list.contains(targetSum)) return true;
//         return false;
//     }
    
//     public void helper(TreeNode root, ArrayList<Integer> l1, int sum, int t){
//         if(root == null){
//             l1.add(sum);
//             return;
//         }
        
//         // if(root.left == null && root.right == null){
//         //     l1.add(sum);
//         //     return;
//         // }
        
//         sum += root.val;
//         helper(root.left, l1, sum, t);
//         helper(root.right, l1, sum, t);
//     }
// }

class Solution {
// my approach....failed for few tescases
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        else if(root.left == null && root.right==null && targetSum-root.val==0) return true;
        else{
            return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
        }
    }
}