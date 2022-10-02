// testcase
// i/p -- 1, 6, 3      o/p--  1
// 2, 6, 7                    6
// 3, 10, 20                  63   // recursive code passed for these testcases

// for large testcase got tle error in recursive code
// i/p --- 30, 30, 500        222616187

// recursive approach
// class Solution {
//     public int numRollsToTarget(int n, int k, int target) {
//         if(n==1){
//             if(target<=k) return 1;
//             return 0;
//         }
//         long ans = helper(n, k, target);
//         return (int)ans%1000000007;
//     }
    
//     public int helper(int n, int k, int t){
//         if(n==0){
//             if(t==0) return 1;
//             return 0;
//         }
        
//         int result=0;
//         for(int i=1;i<=k;i++){
//             result += helper(n-1,k,t-i);
//         }
//         return result;
//     }
// }

// dp approach
class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        int mod = 1000000007;
        
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                
                for(int m =1;m<=Math.min(j,k);m++){
                    // System.out.println(dp[i][j]+"->"+i+"->"+j+"->"+m+" "+dp[i-1][j-m]);
                    dp[i][j] += dp[i-1][j-m];
                    // System.out.println(dp[i][j]);
                    dp[i][j] %= mod;
                }
                // else dp[i][j] = dp[i][j-1] +dp[i-1][j-1]; 
            }
        }
        return dp[n][target];
    }
}


