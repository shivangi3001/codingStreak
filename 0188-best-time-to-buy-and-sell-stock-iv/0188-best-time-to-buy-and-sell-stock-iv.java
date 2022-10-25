// recursive code --- got TLE error
// class Solution {
//     public int maxProfit(int k, int[] prices) {
//         return helper(0,1,prices,k);
//     }
    
//     public int helper(int idx, int buy, int[] arr, int k){
//         if(k==0) return 0;
//         if(idx==arr.length) return 0;
        
//         int profit;
//         if(buy==1) profit = Math.max(-arr[idx]+helper(idx+1,0,arr,k) , 0+helper(idx+1,1,arr,k));
//         else profit = Math.max(arr[idx]+helper(idx+1,1,arr,k-1) , 0+helper(idx+1,0,arr,k));
//         return profit;
//     }
// }

// memoization code -- overlapping problem existing
class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[prices.length+1][2][k+1];
        for(int[][] i : dp){
            for(int[] j : i)  Arrays.fill(j, -1);
        }
        return helper(0,1,prices,k,dp);
    }
    
    public int helper(int idx, int buy, int[] arr, int k, int[][][] dp){
        if(k==0) return 0;
        if(idx==arr.length) return 0;
        if(dp[idx][buy][k] != -1)  return dp[idx][buy][k];
        
        int profit;
        if(buy==1) profit = Math.max(-arr[idx]+helper(idx+1,0,arr,k,dp) , 0+helper(idx+1,1,arr,k,dp));
        else profit = Math.max(arr[idx]+helper(idx+1,1,arr,k-1,dp) , 0+helper(idx+1,0,arr,k,dp));
        return dp[idx][buy][k] = profit;
    }
}