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

//memoization code
class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] i : dp)  Arrays.fill(i, -1);
        
        return helper(0,1,prices,dp);
    }
    public int helper(int idx, int buy, int[] arr, int[][] dp){
        if(idx>=arr.length)   return 0;
        
        if(dp[idx][buy] != -1)  return dp[idx][buy];
        int profit =0;
        if(buy ==1)    profit = Math.max((-1)*arr[idx]+helper(idx+1,0,arr,dp), 0+helper(idx+1,1,arr,dp));
        else           profit = Math.max(arr[idx]+helper(idx+2,1,arr,dp), 0+helper(idx+1,0,arr,dp));
        return dp[idx][buy] = profit;
    }
}


// dp code
// class Solution {
//     public int maxProfit(int[] prices) {
        
//     }
// }