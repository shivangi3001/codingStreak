// testcases -- [4,5,6,7,0,1,2]    0
// [4,5,6,7,0,1,2]                 3
// [1]                             0
// [5,1,3]                         3


// Runtime: 2 ms, faster than 6.65%    Memory Usage: 43.6 MB, less than 5.41%
// my brute force approach
// class Solution {
//     public int search(int[] nums, int target) {
//         int len = nums.length;
//         if(len ==1){
//             if(nums[0]== target)  return 0;
//             else return -1;
//         }
        
//         List<Integer> list = new ArrayList<>();
//         for(int i : nums)  list.add(i);
//         if(list.contains(target))  return list.indexOf(target);
//         return -1;
//     }
// }


// binary search approach
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;     // nums = [4,5,6,7,0,1,2]   len=7
        int s=0, e=len-1;          // s=0,  e=6
        while(s<=e){
            int mid = s+(e-s)/2;     // m=6/2 = 3
            if(nums[mid] == target)  return mid;
            
        // if left side is sorted
            else if(nums[s]<=nums[mid]){
                if(nums[s]<= target && nums[mid]>=target){
                    e=mid-1;
                }
                else  s=mid+1;
            }
        
        // right side is sorted    
            else if(nums[mid]<=nums[e]){
                if(nums[mid]<= target && nums[e]>=target){
                    s = mid+1;
                }
                else  e=mid-1;
            }
        }
        return -1;
    }
}