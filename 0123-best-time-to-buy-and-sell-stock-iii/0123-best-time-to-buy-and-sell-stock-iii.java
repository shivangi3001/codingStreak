
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

// memoization code
class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length+1][2][3];
        for(int[][] i : dp){
            for(int[] j : i)  Arrays.fill(j,-1);
        }  
        return helper(0, prices,1,2,dp);
    }
    
    public int helper(int idx, int[] arr, int buy, int cap, int[][][] dp){
        if(cap==0)  return 0;
        if(idx==arr.length)  return 0;
        
        if(dp[idx][buy][cap] != -1)  return dp[idx][buy][cap];
        
        int profit = 0;
// in case of buying cap value not changing bcoz-> a transctn is said to be complete after buy,sell
        if(buy == 1) profit = Math.max( (-1)*arr[idx] + helper(idx+1,arr,0,cap,dp) , 0+helper(idx+1,arr,1,cap,dp));
        else   profit = Math.max( arr[idx]+helper(idx+1,arr,1,cap-1,dp) , 0+helper(idx+1,arr,0,cap,dp));
        return dp[idx][buy][cap] = profit;
    }
}