class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(len==1 || k==0) return;
        int[] arr = new int[len];
        
        for(int i=0;i<len;i++){
            arr[(i+k)%len] = nums[i];
        }
        
        for(int i=0;i<len;i++)  nums[i]=arr[i];
        
        // for(int i=0;i<len;i++){
        //     if(i+k<len){
        //         int temp = arr[i+k];
        //         arr[i+k] = arr[i];
        //         arr[i]=temp;
        //     }
        //     else{
        //         int temp = arr[(i+k)%len];
        //         arr[(i+k)%len] = arr[i]
        //     }
        // }
    }
}