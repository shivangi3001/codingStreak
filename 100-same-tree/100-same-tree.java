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

// brute force approach
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p.val != q.val) return false;
        
//         while( p.left != null || q.left != null){
//             if(p.left == null && q.left != null) return false;
//             else if(q.left == null && p.left != null) return false;
//             else if(!isSameTree(p.left, q.left)) return false;
//         }
        
//          while( p.right != null || q.right != null){
//             if(p.right == null && q.right != null) return false;
//             else if(q.right == null && p.right != null) return false;
//             else if(!isSameTree(p.right, q.right)) return false;
//         }
//         return true;
//     }
// }


// optimal approach using preorder traversal(root,l,r)   ---> failed for this testcase p = [1,2], q = [1,null,2]
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p == null || q==null){
//             if(p==null && q==null)   return true;
//             return false;
//         }
//         List<Integer> l1 = new ArrayList<>();
//         List<Integer> l2 = new ArrayList<>();
        
//         Stack<TreeNode> st1 = new Stack<>();
//         Stack<TreeNode> st2 = new Stack<>();
        
//         st1.add(p);   st2.add(q);
//         while(!st1.isEmpty()){
//             TreeNode root = st1.pop();
//             l1.add(root.val);
//             if(root.left != null)  st1.add(root.left);
//             if(root.right != null) st1.add(root.right);
//         }
        
//         while(!st2.isEmpty()){
//             TreeNode root = st2.pop();
//             l2.add(root.val);
//             if(root.left != null)  st2.add(root.left);
//             if(root.right != null) st2.add(root.right);
//         }
//         System.out.println(l1+"->"+l2);
//         return l1.equals(l2);

//     }
// }



// testcases--> [1,2,3]
// [1,2,3]
// [1,2]
// [1,null,2]
// [1,2,1]
// [1,1,2]
// [1,2]
// []
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q== null){
            return (p==q);
        }
        
        return (p.val == q.val) && isSameTree(p.left, q.left)  && isSameTree(p.right, q.right); 
    }
}