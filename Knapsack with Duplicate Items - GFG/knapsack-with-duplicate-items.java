//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// recursive code ---> got TLE error at 3rd testcase
// class Solution{
//     static int knapSack(int N, int W, int val[], int wt[])
//     {
//         // code here
//         return helper(N-1, W, val, wt);
//     }
//     static int helper(int idx, int t, int[] val, int[] wt){
//         // for base case assuming t=8, val[]=10, wt[]=3
//         // therefor for idx==0  return t/wt[0] --> (int)8/3 = 2
//         if(idx == 0){
//             return (t/wt[0])*val[0];
//         }
        
//         int not = 0 + helper(idx-1,t,val,wt);
//         int take=0;
//         if(wt[idx] <=t) take = val[idx] + helper(idx, t-wt[idx], val,wt);
//         return Math.max(not,take);
//     }
// }

// testcases 
// 1 8
// 1
// 9

// 12 91
// 81 72 24 4 1 21 1 43 53 13 5 8
// 60 59 26 95 18 59 37 91 61 27 15 74

// dp code
class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int[][] dp = new int[N][W+1];
        // for base case assuming t=8, val[]=10, wt[]=3
       // therefor for idx==0  return t/wt[0] --> (int)8/3 = 2
        for(int j=0;j<=W;j++){
            dp[0][j] = (j/wt[0])*val[0];
        }
        
        for(int i=1;i<N;i++){
            for(int j=0;j<=W;j++){
                int not = dp[i-1][j];
                int take=Integer.MIN_VALUE;
                if(wt[i] <= j) take = val[i] + dp[i][j-wt[i]];
                dp[i][j] = Math.max(not, take);
            }
        }
        return dp[N-1][W];
    }
}