class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(nums[i]))  hm.put(nums[i],1);
            else hm.put(nums[i], hm.get(nums[i])+1);
        }
        int val=0;
        for(int i : hm.keySet()){
            if(hm.get(i)>1) val=i;
        }
        return val;
    }
}