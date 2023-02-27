// brute-force approach
// Runtime: 1 ms   Beats: 100%
class Solution {
    public void moveZeroes(int[] nums) {
        int len =nums.length;
        if(len == 1) return;
        
        int k=0;
        int[] temp = new int[len];
        for(int i=0;i<len;i++){
            if(nums[i] != 0){
                temp[k] = nums[i];
                k++;
            }
        }
        while(k<len){
            temp[k] =0;
            k++;
        }
        for(int i=0;i<len;i++)  nums[i] = temp[i];
    }
}


// class Solution {
//     public void moveZeroes(int[] nums) {
//         int len =nums.length;
//         if(len == 1) return;
        
//         int i=0;  int j=1;
//         while(i<nums.length && j<nums.length){
//             if(nums[i] == 0 && nums[j] != 0){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j]=temp;
//                 i++;
//             }
//             else if(nums[i] != 0 && nums[j]==0){i++; j++;}
//             j++;
//         }
//     }
// }

// testcase 24/74 passed
// [1,0,1]