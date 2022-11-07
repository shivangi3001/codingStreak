//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

// class Solution {
//     public long count(int coins[], int N, int sum) {
//         // code here.
//         List<List<Integer>> l1 = new ArrayList<>();
//         List<Integer> l2 = new ArrayList<>();
        
//         helper(0, coins, sum, l1, l2);
//         return l1.size();
//     }
    
//     public void helper(int idx, int[] arr, int sum, List<List<Integer>> l1, List<Integer> l2){
//         if(idx == arr.length){
//             if(sum==0){
//                 l1.add(new ArrayList<>(l2));
//             }
//             return;
//         }
        
//         l2.add(arr[idx]);
//         sum = sum-arr[idx];
//         helper(idx, arr, sum, l1, l2);
//         sum=sum+arr[idx];
//         l2.remove(l2.size()-1);
        
//         helper(idx+1, arr, sum, l1, l2);
//     }
// }

// dp code
class Solution {
    public long count(int coins[], int N, int sum) {
        
        long[][] dp = new long[N][sum+1];
        
        for(int j=0;j<=sum;j++){
            if(j%coins[0] == 0) dp[0][j] =1;
        }
        
        for(int i=1;i<N;i++){
            for(int j=0;j<=sum;j++){
                long not = dp[i-1][j];
                long take=0;
                if(coins[i]<=j) take=dp[i][j-coins[i]];
                dp[i][j] = not+take;
            }
        }
       return dp[N-1][sum]; 
    }
}