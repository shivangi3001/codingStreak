//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


// recursive code --> got tle error at testcase 1148
// class Solution 
// { 
//     //Function to return max value that can be put in knapsack of capacity W.
//     static int knapSack(int W, int wt[], int val[], int n) 
//     { 
//          // your code here 
//          return helper(n-1, W, wt, val);
//     }
    
//     static int helper(int idx, int t, int[] wt, int[] val){
//         if(t==0)  return 0;
//         if(idx == 0){
//             if(wt[idx]<=t) return val[idx];
//             return 0;
//         }
        
//         int not = 0 + helper(idx-1, t, wt,val);
//         int take=0;
//         if(wt[idx]<=t) take = val[idx] + helper(idx-1, t-wt[idx], wt, val);
        
//         return Math.max(not, take);
//     }
// }


// memoization code
class Solution 
{ 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][] dp = new int[n][W+1];
         for(int[] i : dp)   Arrays.fill(i, -1);
         
         return helper(n-1, W, wt, val, dp);
    }
    
    static int helper(int idx, int t, int[] wt, int[] val, int[][] dp){
        if(t==0)  return 0;
        if(idx == 0){
            if(wt[idx]<=t) return val[idx];
            return 0;
        }
        
        if(dp[idx][t] != -1)  return dp[idx][t];
        
        int not = 0 + helper(idx-1, t, wt,val,dp);
        int take=0;
        if(wt[idx]<=t) take = val[idx] + helper(idx-1, t-wt[idx], wt, val,dp);
        
        return dp[idx][t] = Math.max(not, take);
    }
}
