// leetcode daily challenge - 4th March2023

// https://leetcode.com/problems/count-subarrays-with-fixed-bounds/solutions/3254003/day-63-two-pointer-o-n-time-and-o-1-space-easiest-beginner-friendly-sol/

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        int leftBound = -1;
        int lastMin = -1, lastMax = -1;
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                lastMin = (nums[i] == minK) ? i : lastMin;
                lastMax = (nums[i] == maxK) ? i : lastMax;
                count += Math.max(0, Math.min(lastMin, lastMax) - leftBound);
            } else {
                leftBound = i;
                lastMin = -1;
                lastMax = -1;
            }
        }
        
        return count;
        // int len = nums.length;

        // // int mini=Integer.MAX_VALUE;    int maxi=0;
        // int mini = Math.min(nums[0], nums[1]);
        // int maxi = Math.max(nums[0], nums[1]);

        // long count=0;
        // int i=0; j=1;
        // while(i<len && j<len){
        //     if(mini==minK && maxi==maxK){
        //         count++;
        //     }
        // }
        // for(int i : nums){
        //     mini = Math.min(mini, i);
        //     maxi = Math.max(maxi, i);
        // }

        // return -1;
    }
}