//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// recursive code --> got TLE error at testcase65
// class Solution {
//     static int maxProfit(int K, int N, int A[]) {
//         // code here
        
//         return helper(0,1,A,K);
//     }
    
//     static int helper(int idx, int buy, int[] arr, int k){
//         if(k==0) return 0;
//         if(idx==arr.length)  return 0;
        
//         int profit;
//         if(buy == 1) profit =  Math.max( ((-1)*arr[idx]) + helper(idx+1,0,arr,k) , helper(idx+1, 1,arr,k));
//         // if(buy == 0) 
//         else profit =  Math.max(arr[idx] + helper(idx+1,1,arr,k-1) , helper(idx+1,0,arr,k));
//         return profit;
//     }
// }

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        // code here
        int[][][] dp = new int[N+1][2][K+1];
        
        for(int i=0;i<=N;i++){
            for(int j=0;j<2;j++) dp[i][j][0] =0;
        }
        
        for(int j=0;j<2;j++){
            for(int l=0;l<=K;l++) dp[N][j][l] =0;
        }
        
        int profit;
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=1;k<=K;k++){
                    if(j==1) profit = Math.max((-1)*A[i] + dp[i+1][0][k] , dp[i+1][1][k] );
                    else profit = Math.max(A[i]+dp[i+1][1][k-1] , dp[i+1][0][k] );
                    dp[i][j][k] = profit;
                }
            }
        }
        return dp[0][1][K];
        
        // return helper(0,1,A,K);
    }
}

