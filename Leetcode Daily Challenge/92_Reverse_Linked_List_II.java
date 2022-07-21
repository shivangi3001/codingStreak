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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right) return head;
        
        ListNode prevR = null;   ListNode currR = head;  int c=1;
        
//         while(currR != null && c<left){
//             prevR = currR;
//             currR = currR.next;   c++;
//         }
//         ListNode prev = prevR;    ListNode curr = currR;
        
//         while(currR != null && c<right){
//             ListNode fut = currR.next;
//             currR.next = prevR;
//             prevR = currR;
//         }
//         return prev;

// below code not passed for testcase
// [3,5]
// 1
// 2     
//         while(c<left){
//             prevR = currR;
//             currR = currR.next;
//             c++;
//             // System.out.println(prevR.val+" "+currR.val+" "+c);
//         }

//         // return prevR;
//         ListNode prev = prevR;    ListNode curr = currR;
//         ListNode fut = curr.next;
//         // System.out.println(prev.val+" "+curr.val+" "+fut.val+" "+c);
//         // System.out.println();
//         while(c<=right){
//         // // ListNode fut = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = fut;
//             c++;
//             if(fut != null)  fut = fut.next;
//             //System.out.println(prev.val+" "+curr.val+" "+" "+c);
//   //          // System.out.println(prev.val+" "+curr.val+" "+c);
//         }
//         prevR.next = prev;
//         currR.next = curr;
//         return head;
        
// below code working for this testcase too
// [3,5]
// 1
// 2        
        for(int i=0; currR != null && i<left-1; i++ ){
            prevR = currR;
            currR = currR.next;
        }
        ListNode prev = prevR;
        ListNode last = currR;
        
        ListNode fut = currR.next;
        for(int i=0; currR != null && i<right-left+1; i++){
            currR.next = prevR;
            prevR = currR;
            currR = fut;
            if(fut != null) fut=fut.next;
        }
        if(prev != null) prev.next = prevR;
        else head = prevR;
        last.next = currR;
        return head;
    }
}