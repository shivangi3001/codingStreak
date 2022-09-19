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
// Recursive approach
// class Solution {
//      List<Integer> list = new ArrayList<>();
//     public List<Integer> postorderTraversal(TreeNode root) {
//         helper(root);
//         return list;
//     }
//     public void helper(TreeNode node){
//         if(node == null)  return;
//         if(node.left != null) helper(node.left);
//         if(node.right != null) helper(node.right);
//         list.add(node.val);
        
//     }
// }

// iterative approach using 2 stacks
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         Stack<TreeNode> s1 = new Stack<>();
//         Stack<TreeNode> s2 = new Stack<>();
//         if(root == null)   return list;
        
//         s1.push(root);
//         while(!s1.isEmpty()){
//             root = s1.pop();   s2.push(root);
//             if(root.left != null)  s1.push(root.left);
//             if(root.right != null)  s1.push(root.right);
//         }
//         while(!s2.isEmpty()){
//             root = s2.pop();
//             list.add(root.val);
//         }
//         return list; 
//     }
// }


// iterative approach using 1 stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        if(root == null)  return list;
        while(root != null || !s.isEmpty()){
            if(root != null){
                s.push(root);  root=root.left;
            }
            else{
                TreeNode temp = s.peek().right;
                if(temp==null){
                    temp = s.pop();   list.add(temp.val);
                    while(!s.isEmpty() && temp==s.peek().right){
                        temp=s.pop();
                        list.add(temp.val);
                    }
                }else root=temp;
            }
        }
        return list;
    }
}