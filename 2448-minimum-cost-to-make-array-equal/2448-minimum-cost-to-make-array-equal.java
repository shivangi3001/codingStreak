// daily leetcode challenge - 21st June

// array
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long sum=0;

        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
            sum += cost[i];
        }

        Arrays.sort(arr, (a,b)->a[0]-b[0]);

        long total=0, med=0;
        int i=0;
        while(total<=sum/2 && i<n){
            total += arr[i][1];
            med = arr[i][0];
            i++;
        }
        return calc(nums, cost, med);
    }

    public long calc(int[] nums, int[] cost, long med){
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans += Math.abs(nums[i]-med)*cost[i];
        }
        return ans;
    }
}