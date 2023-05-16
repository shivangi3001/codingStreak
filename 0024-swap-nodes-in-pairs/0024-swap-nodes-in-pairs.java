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

//  leetcode daily challenge - 16th May

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)   return head;

        ListNode n1 = head;
        while(n1.next != null){
            System.out.println(n1.val);
            ListNode t1 = n1;
            ListNode t2 = n1.next;
            n1 = t2.next;
            System.out.println(t1.val+" "+t2.val);

            int tem = t1.val;
            t1.val = t2.val;
            t2.val = tem;
            if(n1 == null)   break;
        }
        return head;
    }
}