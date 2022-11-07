//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// class Solution{
//     static List<Integer> minPartition(int N)
//     {
//         // code here
//         int[] coin = {1,2,5,10,20,50,100,200,500,2000};
//         List<Integer> l1 = new ArrayList<>();
        
//         helper(coin.length-1, N, coin, l1);
//         return l1;
//     }
    
//     static void helper(int idx, int amt, int[] arr, List<Integer> l1){
//         if(idx == 0){
//             if(arr[0]<=amt){
//                 l1.add(arr[0]);
//             }
//             return;
//         }
        
//         if(arr[idx] <= amt){
//             l1.add(arr[idx]);
//             helper(idx, amt-arr[idx], arr, l1);
//             l1.remove(l1.size()-1);
//         }
        
//         helper(idx-1,amt,arr,l1);
//     }
// }

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int[] coin = {1,2,5,10,20,50,100,200,500,2000};
        List<Integer> l1 = new ArrayList<>();
        
        for(int i=coin.length-1;i>=0;i--){
            while(N>=coin[i]){
                N= N-coin[i];
                l1.add(coin[i]);
            }
        }
        return l1;
    }

}