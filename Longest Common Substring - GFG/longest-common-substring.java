//{ Driver Code Starts
//Initial Template for Java

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
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        Set<Integer> ts = new TreeSet<>();
        
        int[][] dp = new int[n+1][m+1];
        for(int i[] : dp)  Arrays.fill(i, -1);
        
        for(int i=0;i<=n;i++)  dp[i][0]=0;
        for(int j=0;j<=m;j++)  dp[0][j]=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if( S1.charAt(i-1) == S2.charAt(j-1) ){
                   dp[i][j] = 1+dp[i-1][j-1];   ts.add(dp[i][j]);
                }
                else dp[i][j]=0;
            }
        }
        List<Integer> l1 = new ArrayList<>(ts);
        // System.out.println(l1);
        if(l1.size() == 0)  return 0;
        return l1.get(l1.size() -1);
    }
}

// testcase 104/119
// 1 7
// D
// IVSINOK