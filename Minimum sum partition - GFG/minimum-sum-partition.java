//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i : arr)  sum+=i;   //System.out.println(sum);
	    
	    boolean[][] dp = new boolean[n][sum+1];
	    for(int i=0;i<n;i++) dp[i][0] = true;
	    
	    if(arr[0]<=sum)  dp[0][arr[0]] = true;
	    
	    for(int i=1;i<n;i++){
	        for(int j=1;j<=sum;j++){
	            boolean not = dp[i-1][j];
	            boolean take = false;
	            if(arr[i]<=j) take = dp[i-1][j-arr[i]];
	            dp[i][j] = not || take;
	        }
	    }
	    
	   int mini = (int)Math.pow(10,6);
	    for(int j=0;j<=sum;j++){
	        if(dp[n-1][j]){
	            int diff = Math.abs(j- (sum-j));
	           // System.out.println(mini+"->"+diff);
	            mini = Math.min(mini,diff);
	        }
	    }
	    return mini;
	} 
}
