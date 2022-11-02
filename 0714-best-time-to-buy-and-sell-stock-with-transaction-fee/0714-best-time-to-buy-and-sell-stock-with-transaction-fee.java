// recursive code
// class Solution {
//     public int maxProfit(int[] prices, int fee) {
        
//         return  helper(0,1,prices,fee);
//     }
    
//     public int helper(int idx, int buy, int[] arr, int fee){
//         if(idx == arr.length) return 0;
        
//         int profit=0;
//         if(buy==1)  profit = Math.max( (-1)*arr[idx]+helper(idx+1,0,arr,fee) , helper(idx+1,1,arr,fee) );
//         else        profit = Math.max( arr[idx]+helper(idx+1,1,arr,fee)-fee , helper(idx+1,0,arr,fee));
//         return profit;
//     }
// }


// memoization code   Runtime: 87 ms, faster than 18.60%   Memory Usage: 83 MB, less than 14.36%
// class Solution {
//     public int maxProfit(int[] prices, int fee) {
//         int[][] dp = new int[prices.length][2];
//         for(int[] i : dp)  Arrays.fill(i, -1);
        
//         return  helper(0,1,prices,fee, dp);
//     }
    
//     public int helper(int idx, int buy, int[] arr, int fee, int[][] dp){
//         if(idx == arr.length) return 0;
//         if(dp[idx][buy] != -1)  return dp[idx][buy];
        
//         int profit=0;
//         if(buy==1)  profit = Math.max( (-1)*arr[idx]+helper(idx+1,0,arr,fee,dp) , helper(idx+1,1,arr,fee,dp) );
//         else        profit = Math.max( arr[idx]+helper(idx+1,1,arr,fee,dp)-fee , helper(idx+1,0,arr,fee,dp) );
//         return dp[idx][buy] = profit;
//     }
// }


// dp code  Runtime: 30 ms, faster than 41.06%     Memory Usage: 74.6 MB, less than 57.44% 
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        
        dp[n][0]=0;   dp[n][1]=0;
        int profit=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1) profit = Math.max( (-1)*prices[i] + dp[i+1][0] , dp[i+1][1]);
                else    profit = Math.max( prices[i] + dp[i+1][1] - fee , dp[i+1][0]);
                dp[i][j]=profit;
            }
        }
        return dp[0][1];
    }
}