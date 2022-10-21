// testcases -- [1,2,3,1]   3
// [1,0,1,1]        1
// [1,2,3,1,2,3]    2
// [1]              0
    
    
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int len = nums.length;
        
        for(int i=0;i<len;i++){
            if(!hm.containsKey(nums[i]))  hm.put(nums[i],i);
            else{
                int a = hm.get(nums[i]);   //System.out.println(nums[i]+" "+hm.get(nums[i])+" "+i);
                if(i-a<=k) return true;
                else hm.put(nums[i],i);
            }
        }
        return false;
        
    }
}