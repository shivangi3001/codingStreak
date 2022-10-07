class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len == 1)   return;   // base case
        
        int i = len-2;
        while(i>=0 && nums[i]>=nums[i+1])  i--;
        if(i>=0){
            int j=len-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, len-1);

    }
    public void swap(int[] arr, int a, int b){
        int t = arr[a];    arr[a]=arr[b];   arr[b]=t;
    }
    
    public void reverse(int[] arr, int s, int e){
        while(s<e){ 
            swap(arr, s, e);
            s++;   e--;  }
    }
}