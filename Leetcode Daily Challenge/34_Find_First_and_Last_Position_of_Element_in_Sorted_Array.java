class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;    res[1] = -1;
        
        res[0] = BS(nums, target, true);
        res[1] = BS(nums, target, false);
        return res;
        
    }
    
    public int BS(int[] arr, int target, boolean flag){
        int s =0;    int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] > target)       e = mid-1;
            else if(arr[mid] < target)  s=mid+1;
            else{
                ans = mid;
                if(flag) e=mid-1;
                else  s=mid+1;
            }
        }
        return ans;
    }
}