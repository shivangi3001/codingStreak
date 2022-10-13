//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
// // recursive approach 
//     public int FindMaxSum(int arr[], int n)
//     {
//         // Your code here
//         return helper(n-1, arr);
//     }
    
//     public int helper(int idx, int[] arr){
//         if(idx == 0) return arr[idx];
//         if(idx<0)  return 0;
        
//         int yes = arr[idx] + helper(idx-2, arr);
//         int no = 0 + helper(idx-1,arr);
//         return Math.max(yes, no);
//     }


// dp tabulation approach 
    public int FindMaxSum(int arr[], int n)
    {
        int[] dp = new int[n+1];
        dp[0]=arr[0];
        
        for(int i=1;i<n;i++){
            int yes = arr[i];   if(i>1) yes+=dp[i-2];
            int no = 0 + dp[i-1];
            dp[i] = Math.max(yes,no);
        }
        return dp[n-1];
    }
    
}