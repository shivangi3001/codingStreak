class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)   return 0;
        if(nums[0] > nums[1] )      return 0;
        if(nums[n-1] > nums[n-2] )  return n-1;

        int s=1, e=n-2;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]>nums[m-1] && nums[m]>nums[m+1])  return m;

            else if(nums[m] > nums[m+1])  e=m-1;
            else  s=m+1;
        }
        return -1;
    }
}


// class Solution {
//     public int findPeakElement(int[] nums) {
//         int s=0;   int e=nums.length-1;
//         while(s<e){
//             int mid = s +(e-s)/2;
//             if(nums[mid] > nums[mid+1])  e=mid;
//             else  s=mid+1;
//         }
//         return s;
//     }
// }