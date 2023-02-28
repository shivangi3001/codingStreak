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

//  leetcode daily challenge - 28th Feb2023
class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> l1 = new ArrayList<>();
        HashMap<String, Integer>hm = new HashMap<>();

        traverse(root, l1, hm);
        return l1;
    }
    
    public String traverse(TreeNode root, List<TreeNode> l1, HashMap<String, Integer>hm){
        if(root == null) return "$";

        String sub = root.val+","+traverse(root.left,l1,hm)+","+traverse(root.right,l1,hm);
        hm.put(sub, hm.getOrDefault(sub, 0)+1);

        if(hm.get(sub) == 2) l1.add(root);
        return sub;
    }

}