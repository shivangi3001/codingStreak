// recursive code---will get TLE error
// class Solution {
//     public int maxProfit(int[] prices) {
        
//         return helper(0,1,prices);
//     }
    
//     public int helper(int idx, int buy, int[] arr){
//         if(idx>=arr.length)  return 0;
        
//         int profit =0;
//         if(buy==1)  profit = Math.max((-1)*arr[idx]+helper(idx+1,0,arr), 0+helper(idx+1,1,arr));
//         else{
//             // if(idx+2<=arr.length)  
//             profit = Math.max(arr[idx]+helper(idx+2,1,arr), 0+helper(idx+1,0,arr));
//         }      
//         return profit;
//     }
// }

//memoization code    Runtime: 3 ms, faster than 35.67%   Memory Usage: 42.3 MB, less than 51.26%
// class Solution {
//     public int maxProfit(int[] prices) {
//         int[][] dp = new int[prices.length][2];
//         for(int[] i : dp)  Arrays.fill(i, -1);
        
//         return helper(0,1,prices,dp);
//     }
//     public int helper(int idx, int buy, int[] arr, int[][] dp){
//         if(idx>=arr.length)   return 0;
        
//         if(dp[idx][buy] != -1)  return dp[idx][buy];
//         int profit =0;
//         if(buy ==1)    profit = Math.max((-1)*arr[idx]+helper(idx+1,0,arr,dp), 0+helper(idx+1,1,arr,dp));
//         else           profit = Math.max(arr[idx]+helper(idx+2,1,arr,dp), 0+helper(idx+1,0,arr,dp));
//         return dp[idx][buy] = profit;
//     }
// }


// dp code
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+2][2];
        
        //dp[n][0] = 0;    dp[n][1]=0;
        
        int profit =0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1)  profit = Math.max( (-1)*prices[i]+dp[i+1][0] , 0+dp[i+1][1]);
                if(j==0){
                    //profit = dp[i+1][0];
                    //if(i+2<=n)  
                    profit = Math.max( prices[i]+dp[i+2][1] , 0+dp[i+1][0] );
                } 
                dp[i][j] = profit;
            }
        }
        return dp[0][1];
    }
}