//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int[][] dp = new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0) dp[i][j] =Matrix[i][j];
                
                else{
                    int left = Matrix[i][j];
                    if(j>0 && i>0) left+=dp[i-1][j-1];
                    else left+=(int)Math.pow(-10,9);
                    
                    int up = Matrix[i][j];
                    if(i>0) up+=dp[i-1][j];
                    else up+=(int)Math.pow(-10,9);
                    
                    int right = Matrix[i][j];
                    if(j<N-1 && i>0)  right+=dp[i-1][j+1];
                    else right +=(int)Math.pow(-10,9);
                    
                    dp[i][j] = Math.max(left, Math.max(up,right));
                }
            }
        }
        int maxi= dp[N-1][0];
        for(int i=1;i<N;i++){
            if(dp[N-1][i]>maxi)  maxi =dp[N-1][i];
        }
        return maxi;
    }
}