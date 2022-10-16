class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {

        
        int n = jobDifficulty.length;
        if(n < d)   return -1;

        int [][] dp = new int[d + 1][n];
        for(int [] arr : dp){
            Arrays.fill(arr, -1);
        }
        return dfs(jobDifficulty, dp, d, 0);
    }
    private int dfs(int [] jobDifficulty, int [][] dp, int d, int idx){
        if(d == 1){
            int max = 0;
            while(idx < jobDifficulty.length){
                max = Math.max(max, jobDifficulty[idx++]);
            }
            return max;
        }
        if(dp[d][idx] != -1){
            return dp[d][idx];
        }
        int leftMax = 0;
        int res = Integer.MAX_VALUE;
        for(int i = idx; i < jobDifficulty.length - d + 1; i++){
            leftMax = Math.max(leftMax, jobDifficulty[i]);
            int rightMax = dfs(jobDifficulty, dp, d - 1, i + 1);
            res = Math.min(res, leftMax + rightMax);
        }
        return dp[d][idx] = res;
        
    }
}