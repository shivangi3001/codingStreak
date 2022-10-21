//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// got TLE error from recursive code
// class Solution {
//     int getPairsCount(int[] arr, int n, int k) {
//         // code here
//         ArrayList<Integer>l1 = new ArrayList<>();
//         helper(0,arr,k,l1);
//         return l1.size();
//     }
    
//     void helper(int idx, int[] arr, int k, ArrayList<Integer>l1){
//         if(idx==arr.length){
//             if(k==0) l1.add(1);
//             return;
//         }
//         helper(idx+1,arr,k-arr[idx],l1);
//         helper(idx+1, arr,k,l1);
//     }
// }

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> m1 = new HashMap<>();
        
        int count=0;
        for(int i : arr){
            if(m1.containsKey(k-i))  count += m1.get(k-i);
            m1.put(i,m1.getOrDefault(i,0)+1);
        }
        return count;
    }
}
