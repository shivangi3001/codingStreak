public class LeetcodeQues102_BT_levelOrderTrav {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        q1.add(root);
        List<Integer> l2 = new ArrayList<>();
        
        
        while(q1.size() > 0) {
            TreeNode node = q1.remove();
            l2.add(node.val);
            
            if(node.left != null)  q2.add(node.left);
            if(node.right != null)  q2.add(node.right);
            
            if(q1.size() == 0){
                q1=q2;   q2 = new ArrayDeque<>();
                list.add(l2);
                l2 = new ArrayList<>();
                // while(l2.size() > 0) l2.remove();
            }
        }
        return list;
    }
}
}
