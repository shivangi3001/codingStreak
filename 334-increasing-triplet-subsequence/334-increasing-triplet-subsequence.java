// testcases
// [1,2,3,4,5]
// [5,4,3,2,1]
// [2,1,5,0,4,6]
// [1]
// [1,2]
// [1,2,3]
// [20,100,10,12,5,13]

// brute force approach
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if(len < 3) return false;
        
//         for(int i=0;i<=len-3;i++){
//             if(nums[i]<nums[i+1]   && nums[i+1]<nums[i+2])   return true;
//         }
//         return false;
        
//   optimal approach
        int a=Integer.MAX_VALUE;     int b = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(nums[i]<=a)  a= nums[i];
            else if(nums[i]<=b)  b=nums[i];
            else   return true;
        }
        return false;
        
    }
    
    
    
//     public boolean helper(int idx, int prev, int[] nums, int c){
//         if(idx == nums.length){
//             if(c==0) return true;
//             return false;
//         }
        
//         if(nums[idx]>prev)  helper(idx+1, nums[idx], nums, c--);
        
//         helper(idx+1, prev, nums, c++);
//     }
}