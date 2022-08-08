// testcase

// [10,9,2,5,3,7,101,18]
// [0,1,0,3,2,3]
// [7,7,7,7,7,7,7]
// [1,3,6,7,9,4,10,5,6]

// output --- 4
// 4
// 1
// 6


class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
//      intitializing dp arr of same size as that of nums
        int[] dp = new int[n];
//      intializing 1st element of dp as 1...considering the length of longest increasing subsequence at that point
        dp[0]=1;
        
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    if(max<dp[j])   max = dp[j];
                }
            }
            dp[i]=max+1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)  list.add(dp[i]);
        
//      sorting dp array or list in ascending order to return max value
        Collections.sort(list);
        // System.out.println(list);
        return list.get(n-1);
    }
}