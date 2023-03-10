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

// leetcode daily challenge - 10th March
// approach -> convert linkedList to list -> randomly generate idx, get value at that idx

class Solution {
    List<Integer> l1 = new ArrayList<>();

    public Solution(ListNode head) {
        // ListNode node = head;
        while(head != null){
            l1.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
        int i = (int)(Math.random() * l1.size());
        return l1.get(i);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */