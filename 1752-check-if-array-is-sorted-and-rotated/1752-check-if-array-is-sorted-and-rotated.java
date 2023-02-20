// Runtime 0 ms      Beats 100%

// striver DSA A-Z sheet -> easy section
class Solution {
    public boolean check(int[] nums) {
        int len=nums.length;
        // if(len<3)

        int c=0;
        for(int i=1;i<len;i++){
            int a =nums[i-1];   int b=nums[i];
            if(a>b) c++;
            if(c>1) return false;
        }
        if(c==1){
            if(nums[len-1]>nums[0]) return false;
            return true;
        }
        return true;
    }
}