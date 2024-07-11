class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n<2) return nums[0];

        int s=0, e=nums.length-1;
        int mins = Integer.MAX_VALUE;

        while(s<=e){
            int m=s+(e-s)/2;
            mins = Math.min(mins, nums[m]);

            if(nums[s] <= nums[m]){
                mins = Math.min(mins, nums[s]);
                s=m+1;
            }    
            if(nums[m+1] <= nums[e] ){
                mins = Math.min(mins, nums[m+1]);
                e=m-1;
            }
            // System.out.println(s+" "+m+" "+e+"-> "+mins); 
        }
        return mins;
    }
}