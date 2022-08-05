class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        // dp approach
        int[] dp = new int[target+1];
        dp[0]=1;
        
        for(int i=0;i<target+1;i++){
            for(int j=0;j<nums.length;j++){
                if(i>= nums[j])   dp[i] += dp[i-nums[j]];
                //System.out.println(i+"->"+j+"->"+dp[i]);
            }
        }
        return dp[target];
    }
}