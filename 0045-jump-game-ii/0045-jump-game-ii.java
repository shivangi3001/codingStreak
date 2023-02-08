// daily leetcode problem -> 8th Feb 2023

// Runtime 39 ms         Beats  35.99%
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        if(n == 1)  return 0;

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n-1] = 0;

        for(int i=n-2;i>=0;i--){
            int min = Integer.MAX_VALUE;
            for(int j=i+1;j<=Math.min(n-1, i+nums[i]);j++){
                min = Math.min(min, dp[j]);
            }
            if(min != Integer.MAX_VALUE)   dp[i]=min+1;
        }
        return dp[0];
    }
}


// my code--> failed few testcases
// class Solution {
//     public int jump(int[] nums) {
//         int len = nums.length;

//         if(len == 1)  return 0;

//         int[] dp = new int[len];
//         Arrays.fill(dp, Integer.MAX_VALUE);
//         dp[len-1] = 0;

//         for(int i=len-2;i>=0;i--){
//             int a = nums[i];  int mini = Integer.MAX_VALUE;
//             if(a==0) mini=0;
//             for(int j=a;j>0;j--){
//                 if(i+j<len){
//                     System.out.println( mini+" "+dp[i+j]+" "+i+" "+j );
//                     mini = Math.min( mini, dp[i+j] );
//                 } 
//             }
//             dp[i] = 1+mini;
//             System.out.println(i+" "+dp[i]);
//         }
//         return dp[0];
//     }
// }


// testcase -> [2,0,2,4,6,0,0,3]