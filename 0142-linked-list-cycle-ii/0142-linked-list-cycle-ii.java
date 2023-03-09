/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//approach-1 HashTable based approach--- T.C--O(n), S.C--O(n)-->hashmap
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if(head == null || head.next == null)  return null;
        
//         HashMap<ListNode, Integer> hm = new HashMap<>();
//         while(head.next != null){
//             if(!hm.containsKey(head)) hm.put(head, 1);
//             else   return head;
//             head=head.next;
//         }
//         return null;
//     }
// }

//leetcode daily challenge - 9th march2023
// approach -2 two-pointer based approach--T.C-->O(n)  S.C-->O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)  return null;
        
        ListNode slow = head, fast = head, e=head;
        while(fast != null && fast.next != null){
            slow = slow.next;   fast = fast.next.next;
            if(slow == fast){
                while(e != slow){
                    e=e.next;
                    slow=slow.next;
                }
                return e;
            }
        }
        return null;
    }
}


// approach -2 two-pointer based approach--T.C-->O(n)  S.C-->O(1)
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
        
//         ListNode slow = head;    ListNode fast = head;
//         while(fast!= null && fast.next != null){
//             slow=slow.next;
//             fast=fast.next.next;
            
//             if(slow == fast){
//                 slow = head;
//                 if(slow == fast)  return slow;
//                 else{
//                     while(slow != fast){
//                         slow=slow.next;
//                         fast=fast.next;
//                     }
//                     return slow;
//                 }
//             }
//         }
//         return null;
        
//     }
// }