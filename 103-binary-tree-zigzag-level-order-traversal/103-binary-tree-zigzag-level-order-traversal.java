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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        if(root == null)   return l1;
        else if(root.left == null && root.right == null){
            l2.add(root.val);  l1.add(l2);   return l1;
        }
        
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);   int level=0;
        
        while(st1.size()>0){
            TreeNode n1 = st1.pop();
            l2.add(n1.val);
            if(level%2 != 0){
                if(n1.right != null)  st2.push(n1.right);
                if(n1.left != null)  st2.push(n1.left);
                
            }
            else{
                if(n1.left != null)  st2.push(n1.left);
                if(n1.right != null)  st2.push(n1.right);
            }
            
            if(st1.size()==0){
                st1=st2;   st2=new Stack<>(); level++;
                l1.add(new ArrayList<>(l2));
                l2=new ArrayList<>();
            }
        }
//         l1.add(new ArrayList<>(l2));
//         //l2 = new ArrayList<>();
//         st1 = st2;
//         st2 = new Stack<>();
        
        return l1;
    }
}