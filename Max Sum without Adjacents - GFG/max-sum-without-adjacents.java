//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
// my approach failed for this testcase -->
// 42
// 468 335 1 170 225 479 359 463 465 206 146 282 328 462 492 496 443 328 437 392 105 403 154 293 383 422 217 219 396 448 227 272 39 370 413 168 300 36 395 204 312 323 

// my some random approach
    // int findMaxSum(int arr[], int n) {
    //     // code here
    //     int[] nic = new int[n];
    //     int[] ic = new int[n];
        
    //     nic[0] = 0;   ic[0]=arr[0];
        
    //     for(int i=1;i<n;i++){
    //         nic[i] = ic[i-1];
    //         ic[i] = nic[i-1] + arr[i];
    //     }
        
    //     return Math.max(nic[n-1], ic[n-1]);
    // }
    
// recursive approach
    // int findMaxSum(int arr[], int n) {
    //     return helper(n-1,arr);
    // }
    
    // int helper(int idx, int[] arr){
    //     if(idx == 0) return arr[idx];
    //     if(idx<0)  return 0;
        
    //     int pick = arr[idx] + helper(idx-2, arr);
    //     int notPick = 0+ helper(idx-1, arr);
    //     return Math.max(pick, notPick);
    // }
    
// dp tabulation approach
    // int findMaxSum(int arr[], int n) {
    //     int[] dp = new int[n];
    //     dp[0] = arr[0];  
    //     // dp[1]=arr[0];
        
    //     for(int i=1;i<n;i++){
    //         // int pick = arr[i]; + dp[i-2];
    //         int pick = arr[i];
    //         if(i>1) pick+=dp[i-2];
    //         int notPick = 0 +dp[i-1];
    //         dp[i]= Math.max(pick, notPick);
    //     }
    //     return dp[n-1];
    // }
    
// dp tabulation approach with space optimization
    int findMaxSum(int arr[], int n) {
        // int[] dp = new int[n];
        // dp[0] = arr[0]; 
        int prev2=0, prev=arr[0], curr=prev;
        
        for(int i=1;i<n;i++){
            // int pick = arr[i];
            // if(i>1) pick+=dp[i-2];
            // int notPick = 0 +dp[i-1];
            // dp[i]= Math.max(pick, notPick);
            int pick = arr[i] + prev2;
            int notPick = 0 + prev;
            curr = Math.max(pick, notPick);
            prev2=prev;    prev=curr;
        }
        return curr;
    }
}