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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
//  iterative approach
//         ListNode prev = null;
//         ListNode pres = head;
//         ListNode fut = pres.next;
        
//         while(pres != null){
//             pres.next = prev;
//             prev = pres;
//             pres = fut;
//             if(fut != null)   fut = fut.next;
//         }
//         return prev;
        
    // recursive approach
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}