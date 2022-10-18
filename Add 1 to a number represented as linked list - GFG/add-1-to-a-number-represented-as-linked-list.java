//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/
// I/p --> 456         o/p--> 457
// I/p --> 9           o/p --> 10

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node n1 = reverse(head);
        
        Node curr=n1, curr1=n1, prev=null;
        int carry=0;
        
        while(curr != null){
            int sum=0;
            if(prev == null) sum=curr.data+1;
            else   sum=curr.data+carry;
            carry = sum/10;
            curr.data = sum%10;
            prev=curr;   curr=curr.next;
        }
        if(carry != 0){
            Node n2 = new Node(1);
            prev.next = n2;
        }
        return reverse(curr1);
    }
    
    public static Node reverse(Node head){
        Node pres=head;  Node prev=null;  Node fut=null;
        while(pres != null){
            fut=pres.next;
            pres.next = prev;
            prev=pres;  pres=fut;
        }
        return prev;
    }
        
        // if(head == null) return head;
        // if(head.next == null){
        //         int val = head.data;
        //     Node newR = new Node(val+1);
        //     return newR;
        // }
        
        // // Node root = head;
        // // while(root.next != null){
        // //     if(root.next.next == null){
        // //         int val = root.next.data;
        // //         Node newR = new Node(val+1);
        // //         root.next = newR;   newR.next=null;
        // //     }
        // //     root=root.next;
        // // }
        // // return head;
        // Node oriHead = head;
        // Node newHead = reverse(head);
        
        // if(newHead.data != 9) 
}
