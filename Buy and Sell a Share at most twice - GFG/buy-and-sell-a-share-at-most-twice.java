//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxProfit(int n, int[] price) {
        // code here
        int len = price.length;
        int[][][] dp = new int[len+1][2][3];
        
        for(int i=0;i<=len;i++){
            for(int j=0;j<2;j++)  dp[i][j][0]=0;
        }
        for(int j=0;j<2;j++){
            for(int k=0;k<3;k++) dp[len][j][k]=0;
        }
        
        int profit=0;
        for(int i=len-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=1;k<3;k++){
                    if(j==1)   profit = Math.max( (-1)*price[i] + dp[i+1][0][k] , dp[i+1][1][k]);
                    else    profit = Math.max( price[i]+dp[i+1][1][k-1] , dp[i+1][0][k] );
                    dp[i][j][k] = profit;
                }
            }
        }
        return dp[0][1][2];
    }
}
        
