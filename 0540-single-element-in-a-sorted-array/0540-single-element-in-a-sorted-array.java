// binary search approach - T.c o(logn)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1)   return nums[0];
        
        if(nums[0] != nums[1])      return nums[0];
        if(nums[n-1] != nums[n-2])  return nums[n-1];

        int s=1, e=n-2;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m-1] != nums[m]  && nums[m] != nums[m+1] )  return nums[m];

            // left side
            if( (m%2==0 && nums[m]==nums[m+1]) || (m%2!=0 && nums[m-1]==nums[m]) )
                s=m+1;
            if( (m%2 != 0 && nums[m]==nums[m+1]) || (m%2==0 && nums[m-1]==nums[m]) )
                e=m-1;
        }
        return -1;
    }
}

// bit manipulation approach
// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int len = nums.length;

//         int a=0;
//         for(int i : nums) a = a^i;
//         return a;

//     }
// }


// leetcode daily challenge -> 21st feb2023

// Runtime: 18 ms, faster than 5.17%
// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int len = nums.length;

//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i : nums){
//             if(!hm.containsKey(i)) hm.put(i,1);
//             else hm.put(i, hm.get(i)+1);
//         }
//         int val =-1;
//         for(int i : hm.keySet()){
//             if(hm.get(i) == 1) val=i;
//         }
//         return val;
//     }
// }
