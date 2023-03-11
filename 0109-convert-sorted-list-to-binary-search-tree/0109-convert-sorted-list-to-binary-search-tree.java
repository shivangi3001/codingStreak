/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

//  leetcode daily challenge - 11th March 
// BST, linkedList,2-pointer, recursive
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null )  return null;
        
        ListNode mid = middle(head);          // mid node becomes the root ot the tree or subtree
        TreeNode root = new TreeNode(mid.val);
        if(mid == head) return root;

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);

        return root;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head, fast=head, prev=head;
        while(fast != null && fast.next != null){   //to find the mid node
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev != null) prev.next = null;    //braking the bond b/w rest of the likedlist node and the mid node
        return slow;
    }
}