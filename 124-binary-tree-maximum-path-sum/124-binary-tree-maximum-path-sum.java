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

// testcases --> [1,2,3]                 o/p --> 6
// [-10,9,20,null,null,15,7]                     42
// [15,10,20,null,null,-30,-15]                  45
// [-3]                                          0

class Solution {
    public int maxPathSum(TreeNode root) {
        if(root == null)  return 0;
        
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        helper(root, maxi);
        return maxi[0];
    }
    
    public int helper(TreeNode root, int[] maxi){
        if(root == null)   return 0;        //base case
        
        int leftSum = helper(root.left, maxi);     //finding the left sum
        int rightSum = helper(root.right, maxi);   // finding the righ sum
// if either left or right sum < 0 then to avoid considering it in the maxPathSum
        if(leftSum<0)  leftSum=0;
        if(rightSum<0) rightSum=0;
        
        maxi[0] = Math.max(maxi[0], root.val+leftSum+rightSum);    //finding ans storing the max val till now
        //System.out.println(maxi[0]+" "+root.val+" "+leftSum+" "+rightSum);
        
        return root.val + Math.max(leftSum, rightSum);     // returning the max value of any particular node
    }
}