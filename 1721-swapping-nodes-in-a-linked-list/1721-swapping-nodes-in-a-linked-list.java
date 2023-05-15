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

//  leetcode daily challenge - 15th May

// approach
//  1,2,3,4,5,6,7,8,9,10
// [7,9,6,6,7,8,3,0,9,5]
// left=1, right=1;
// for i=1 -> i<5 --> left=5, right=1, curr=5
// till the time curr != null --> curr=curr.next & right = right.next
// curr=6,  right=2
// curr=7,  right=3
// cu=8, ri=4
// cu=9, ri=5
// cu=10, ri=6, left=5 ---> swap index 5 and 6

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode left = head;
        ListNode right = head;
        for(int i=1;i<k;i++){
            left = left.next;
        }
        ListNode curr = left;
        while(curr.next != null ){
            System.out.println("cree->"+curr.val+" "+right.val);
            curr = curr.next;
            right = right.next;
                
        }
        System.out.println(left.val+" "+right.val);

        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}