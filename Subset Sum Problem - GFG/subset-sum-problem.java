//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// recursive code --> got TLE error
// class Solution{
//     static Boolean isSubsetSum(int N, int arr[], int sum){
//         // code here
        
//         return helper(N-1, arr, sum);
//     }
    
//     static Boolean helper(int idx, int[] arr, int sum){
//         if(sum == 0) return true;
//         if(idx == 0) return arr[idx]==sum;
        
//         boolean notTaken = helper(idx-1, arr, sum);
//         boolean taken = false;
//         if(arr[idx]<=sum) taken = helper(idx-1, arr, sum-arr[idx]);
//         return  notTaken || taken;
//     }
// }

// memoization approach --- passed all testcases--time taken - 0.19
// class Solution{
//     static Boolean isSubsetSum(int N, int arr[], int sum){
//         // code here
//         int[][] dp = new int[N][sum+1];
//         for(int[] i : dp)  Arrays.fill(i, -1);
        
//         return helper(N-1, arr, sum, dp);
//     }
    
//     static Boolean helper(int idx, int[] arr, int sum, int[][] dp){
//         if(sum == 0) return true;
//         if(idx == 0) return arr[idx]==sum;
//         if(dp[idx][sum] != -1)  return dp[idx][sum]==0?false:true;
        
//         boolean notTaken = helper(idx-1, arr, sum,dp);
//         boolean taken = false;
//         if(arr[idx]<=sum) taken = helper(idx-1, arr, sum-arr[idx],dp);
//         dp[idx][sum] = notTaken || taken?1:0;
//         return  notTaken || taken;
//     }
// }


// dp approach
class Solution{
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp = new boolean[N][sum+1];
        
        for(int i=0;i<N;i++) dp[i][0]=true;
        
        dp[0][arr[0]] =true;
        
        for(int i=1;i<N;i++){
            for(int j=1;j<=sum;j++){
                boolean not = dp[i-1][j];
                boolean taken=false;
                if(arr[i]<=j) taken = dp[i-1][j-arr[i]];
                dp[i][j] = not || taken;
            }
        }
        return dp[N-1][sum];
    }

}