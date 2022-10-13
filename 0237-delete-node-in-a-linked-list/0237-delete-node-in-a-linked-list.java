/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // ListNode root = head;
        // while(root.next != null){
        //     if(root.next.val == node.val)  root.next = root.next.next;
        // }
        // ListNode fut = node.next;
        // ListNode prev = node;
        // node = fut;    fut.next=prev;
        // node = node.next.next;
        
        //ListNode root = node.next;
        node.val = node.next.val;
        node.next=node.next.next;
    }
}