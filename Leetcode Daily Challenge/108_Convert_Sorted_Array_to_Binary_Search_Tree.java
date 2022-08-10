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
    public TreeNode sortedArrayToBST(int[] nums) {
//         TreeNode root = new TreeNode();
        
//         int s=0 int e= nums.length;
//         int mid = s + (e-s)/2;
            
//         root.val = nums[mid];
        
//         root.left = 
        if(nums == null || nums.length==0)   return null;
        return ConstructBST(nums, 0, nums.length-1);
    }
    
    public static TreeNode ConstructBST(int[] arr, int left, int right){
//         base condition
        if(left>right)   return null;
        
//         since array is sorted in ascending order so mid element will become the root element
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = ConstructBST(arr,left,mid-1);
        root.right = ConstructBST(arr,mid+1,right);
        return root;
        
    }
}