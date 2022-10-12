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

// testcases --> [1,2,3,null,5,null,4]
// [1,null,3]
// []
// [1,2,3,4,5,null,7,null,null,6,null]

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> l1 = new ArrayList<>();
        if(root == null)  return l1;
        
        helper(root, 0, l1);
        return l1;
    }
    
    public void helper(TreeNode root, int level, ArrayList<Integer> l1){
        if(root == null )  return;
        
        if(level == l1.size()){
            l1.add(root.val);
        }
        
        helper(root.right, level+1, l1);
        helper(root.left, level+1, l1);
    }
}