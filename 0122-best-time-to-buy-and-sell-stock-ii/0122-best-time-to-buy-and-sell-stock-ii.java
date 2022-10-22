// recursive code---> got TLE error
// class Solution {
//     public int maxProfit(int[] prices) {
//         return helper(0,prices,true);    //1-> allowed to buy   0-> not allowed to buy
//     }
    
//     public int helper(int idx, int[] arr, boolean buy){
//         if(idx==arr.length)  return 0;
        
//         int pro1 = 0,  pro2=0,  profit1=0,  profit2=0;
//         if(buy){  //if buy==1 -> means no stock holding---> so can buy
//             pro1 = (-1)*arr[idx] + helper(idx+1, arr, false);  //bought -->so buy set->0  therefore cant buy before selling
//             pro2 = 0 + helper(idx+1, arr, true);        //not bought -->so buy=1. therefore still can buy
//             profit1 = Math.max(pro1,pro2);
//         }
//         else{   //if buy=0 -> means person still holding stocks --> so cannot buy
//             pro1 = arr[idx] + helper(idx+1, arr, true);  //sold ->therfore buy=1--> now person allowd to buy again
//             pro2 = 0 + helper(idx+1, arr, false);  //notSold -> still holding the stock.. so buy=0-> not allowed to buy 
//             profit2 = Math.max(pro1, pro2);
//         }
//         return Math.max(profit1,profit2);
//     }
// }

// memoization code
class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] i: dp)  Arrays.fill(i,-1);
        
        return helper(0,prices,1, dp);    //1-> allowed to buy   0-> not allowed to buy
    }
    
    public int helper(int idx, int[] arr, int buy, int[][] dp){
        if(idx==arr.length)  return 0;
        if(dp[idx][buy] != -1)  return dp[idx][buy];
        
        int pro1 = 0,  pro2=0,  profit1=0,  profit2=0;
        if(buy==1){  //if buy==1 -> means no stock holding---> so can buy
            pro1 = (-1)*arr[idx] + helper(idx+1, arr, 0, dp);  //bought -->so buy set->0  therefore cant buy before selling
            pro2 = 0 + helper(idx+1, arr, 1, dp);        //not bought -->so buy=1. therefore still can buy
            profit1 = Math.max(pro1,pro2);
        }
        else{   //if buy=0 -> means person still holding stocks --> so cannot buy
            pro1 = arr[idx] + helper(idx+1, arr, 1, dp);  //sold ->therfore buy=1--> now person allowd to buy again
            pro2 = 0 + helper(idx+1, arr, 0, dp);  //notSold -> still holding the stock.. so buy=0-> not allowed to buy 
            profit2 = Math.max(pro1, pro2);
        }
        return dp[idx][buy] = Math.max(profit1,profit2);
    }
}