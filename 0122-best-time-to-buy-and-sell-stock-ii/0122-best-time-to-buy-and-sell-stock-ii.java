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


// memoization code  Runtime: 8 ms, faster than 8.36%    Memory Usage: 48 MB, less than 5.08%
// class Solution {
//     public int maxProfit(int[] prices) {
//         int[][] dp = new int[prices.length][2];
//         for(int[] i: dp)  Arrays.fill(i,-1);
        
//         return helper(0,prices,1, dp);    //1-> allowed to buy   0-> not allowed to buy
//     }
    
//     public int helper(int idx, int[] arr, int buy, int[][] dp){
//         if(idx==arr.length)  return 0;
//         if(dp[idx][buy] != -1)  return dp[idx][buy];
        
//         int pro1 = 0,  pro2=0,  profit1=0,  profit2=0;
//         if(buy==1){  //if buy==1 -> means no stock holding---> so can buy
//             pro1 = (-1)*arr[idx] + helper(idx+1, arr, 0, dp);  //bought -->so buy set->0  therefore cant buy before selling
//             pro2 = 0 + helper(idx+1, arr, 1, dp);        //not bought -->so buy=1. therefore still can buy
//             profit1 = Math.max(pro1,pro2);
//         }
//         else{   //if buy=0 -> means person still holding stocks --> so cannot buy
//             pro1 = arr[idx] + helper(idx+1, arr, 1, dp);  //sold ->therfore buy=1--> now person allowd to buy again
//             pro2 = 0 + helper(idx+1, arr, 0, dp);  //notSold -> still holding the stock.. so buy=0-> not allowed to buy 
//             profit2 = Math.max(pro1, pro2);
//         }
//         return dp[idx][buy] = Math.max(profit1,profit2);
//     }
// }


// dp code
class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int[][] dp = new int[n+1][2];
        dp[n][0] = 0;  dp[n][1]=0;
        
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                int profit1 =0, profit2=0;
                if(j==1) profit1 = Math.max( (-1)*prices[i] + dp[i+1][0] , 0+dp[i+1][1] );
                else     profit2 = Math.max( prices[i] + dp[i+1][1] , 0 + dp[i+1][0] );
                dp[i][j] = Math.max(profit1, profit2);
            }
        }
        return dp[0][1];
        
        // return helper(0,prices,1, dp);    //1-> allowed to buy   0-> not allowed to buy
    }
}

// testcases--> [7,1,5,3,6,4]
// [1,2,3,4,5]
// [7,6,4,3,1]
// [397,6621,4997,7506,8918,1662,9187,3278,3890,514,18,9305,93,5508,3031,2692,6019,1134,1691,4949,5071,799,8953,7882,4273,302,6753,4657,8368,3942,1982,5117,563,3332,2623,9482,4994,8163,9112,5236,5029,5483,4542,1474,991,3925,4166,3362,5059,5857,4663,6482,3008,3616,4365,3634,270,1118,8291,4990,1413,273,107,1976,9957,9083,7810,4952,7246,3275,6540,2275,8758,7434,3750,6101,1359,4268,5815,2771,126,478,9253,9486,446,3618,3120,7068,1089,1411,2058,2502,8037,2165,830,7994,1248,4993,9298,4846,8268,2191,3474,3378,9625,7224,9479,985,1492,1646,3756,7970,8476,3009,7457,8922,2980,577,2342,4069,8341,4400,2923,2730,2917,105,724,518,5098,6375,5364,3366,8566,8838,3096,8191,2414,2575,5528,259,573,5636,4581,9049,4998,2038,4323,7978,8968,6665,8399,7309,7417,1322,6391,335,1427,7115,853,2878,9842,2569,2596,4760,7760,5693,9304,6526,8268,4832,6785,5194,6821,1367,4243,1819,9757,4919,6149,8725,7936,4548,2386,5354,2222,8777,2041,1,2245,9246,2879,8439,1815,5476,3200,5927,7521,2504,2454,5789,3688,9239,7335,6861,6958,793...]      o/p--> 324318