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

// leetcode daily challenge -> 17th May
// Runtime: 54 ms    Beats: 8.73%
  
class Solution {
    public int pairSum(ListNode head) {
        
        ListNode n1 = head;
        int c=1;
        while(n1.next != null){
            c++;
            n1=n1.next;
        }
        System.out.println("c->"+c);

        int co=1;
        ListNode n2 = head;
        Stack<Integer>st = new Stack<>();
        // Stack<Integer>st2 = new Stack<>();

        while(n2 != null){
            if(co > c/2) st.push(n2.val);
            n2 = n2.next;
            co++; 
        }
        System.out.println("size->"+st.size());
        
        int cou=1;   int maxi=0;
        ListNode n3 = head;
        while(cou <= c/2){
            maxi = Math.max(maxi, n3.val+st.pop());
            n3=n3.next;   cou++;
        }
        return maxi;
    }
}