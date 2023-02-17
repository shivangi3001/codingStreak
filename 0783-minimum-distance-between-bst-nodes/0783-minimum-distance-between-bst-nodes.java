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

//  leetcode daily challenge -> 17th Feb2023
// Runtime: 2 ms        Beats: 9.52%
class Solution {
    public int minDiffInBST(TreeNode root) {
        // using inorder traversal -> left,root,right -> sorts BST in sorted arrayList
        List<Integer> l1 = new ArrayList<>();

        helper(root, l1);
        // System.out.println(l1);
        int mini=Integer.MAX_VALUE;
        for(int i=1;i<l1.size();i++){
            int a = l1.get(i) - l1.get(i-1);
            mini = Math.min(a, mini);
        }
        return mini; 
    }

    public void helper(TreeNode root, List<Integer> l1){
        if(root == null)  return;

        helper(root.left, l1);
        l1.add(root.val);
        helper(root.right, l1);
    }
}