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

// recursive approach
// class Solution {
//     ArrayList<Integer> list = new ArrayList<>();
//     public List<Integer> inorderTraversal(TreeNode root) {
//         helper(root);
//         return list;
//     }
    
//     public void helper(TreeNode node){
//         if(node == null) return;
        
//         if(node.left != null)  helper(node.left);
//         list.add(node.val);
//         if(node.right != null)  helper(node.right);
        
//     } 
// }

// iterative approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        while(true){
            if(root != null){
                s.push(root);   root=root.left;
            }
            else{
                if(s.isEmpty()) break;
                root = s.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}