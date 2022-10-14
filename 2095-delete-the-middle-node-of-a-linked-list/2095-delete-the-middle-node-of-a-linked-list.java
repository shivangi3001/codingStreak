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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head=head.next;   return head;
        }
        ListNode root = head;
        int size = 0;
        while(root != null){
            root=root.next; size++;
        }
        //System.out.println(size);
        int a = size/2;
        
        int b=0;
        ListNode node = head;
        while(node != null){
            if(b==a-1){
                node.next = node.next.next;
            }
            node = node.next;   b++;
        }
        
        return head;
    }
}