class Solution {
        public ListNode partition(ListNode head, int x) {
            
            ListNode small = new ListNode(0);
            ListNode big = new ListNode(0);
            
            ListNode smallHead = small;
            ListNode bigHead = big;
            
            while(head != null){
                if(head.val <x){
                    smallHead.next = head;
                    smallHead = smallHead.next;
                }else{
                    bigHead.next = head;
                    bigHead = bigHead.next;
                }
                head = head.next;
            }
            bigHead.next = null;
            smallHead.next = big.next; 

            return small.next;
        }
    }