// Runtime 7 ms     Beats 7.62%
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int s=0;  int e=nums.length-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(target == nums[m])  return m;
            else if(target > nums[m]) s=m+1;
            else   e=m-1;
        }
        System.out.println(s+" "+e);
        return s;
    }
}