
// // recursive code--> got TLE error
// class Solution {
//     public int maxProfit(int[] prices) {
//         return helper(0, prices, 1, 2);
//     }
    
//     public int helper(int idx, int[] arr, int buy, int cap){
//         if(cap==0)  return 0;
//         if(idx==arr.length)  return 0;
        
//         int profit = 0;
// // in case of buying cap value not changing bcoz-> a transctn is said to be complete after buy,sell
//         if(buy == 1) profit = Math.max( (-1)*arr[idx] + helper(idx+1,arr,0,cap) , 0+helper(idx+1,arr,1,cap));
//         else   profit = Math.max( arr[idx]+helper(idx+1,arr,1,cap-1) , 0+helper(idx+1,arr,0,cap));
//         return profit;
//     }
// }

// memoization code  Runtime: 409 ms, faster than 7.20%   Memory Usage: 142.2 MB, less than 8.68%  
// class Solution {
//     public int maxProfit(int[] prices) {
//         int[][][] dp = new int[prices.length+1][2][3];
//         for(int[][] i : dp){
//             for(int[] j : i)  Arrays.fill(j,-1);
//         }  
//         return helper(0, prices,1,2,dp);
//     }
    
//     public int helper(int idx, int[] arr, int buy, int cap, int[][][] dp){
//         if(cap==0)  return 0;
//         if(idx==arr.length)  return 0;
        
//         if(dp[idx][buy][cap] != -1)  return dp[idx][buy][cap];
        
//         int profit = 0;
// // in case of buying cap value not changing bcoz-> a transctn is said to be complete after buy,sell
//         if(buy == 1) profit = Math.max( (-1)*arr[idx] + helper(idx+1,arr,0,cap,dp) , 0+helper(idx+1,arr,1,cap,dp));
//         else   profit = Math.max( arr[idx]+helper(idx+1,arr,1,cap-1,dp) , 0+helper(idx+1,arr,0,cap,dp));
//         return dp[idx][buy][cap] = profit;
//     }
// }

// dp code
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        // dp[n][0][2] = 0;   dp[n][1][2] =0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<2;j++) dp[i][j][0]=0;
        }
        
        for(int j=0;j<2;j++){
            for(int k=0;k<3;k++) dp[n][j][k]=0;
        }
        
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                for(int k=1;k<3;k++){
                    int profit=0;
                    if(j==1)  profit = Math.max( (-1)*prices[i] + dp[i+1][0][k] , 0+dp[i+1][1][k] );
                    else   profit = Math.max( prices[i]+dp[i+1][1][k-1] , 0+dp[i+1][0][k] );
                    dp[i][j][k] = profit;
                }
            }
        }
        return dp[0][1][2];
        
        // for(int[][] i : dp){
        //     for(int[] j : i)  Arrays.fill(j,-1);
        // }  
        // return helper(0, prices,1,2,dp);
    }
}
