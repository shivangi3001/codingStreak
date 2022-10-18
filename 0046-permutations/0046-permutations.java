class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        boolean[] freq = new boolean[nums.length];
        
        helper(nums,l1, l2, freq);
        return l1;
    }
    
    public void helper(int[] nums, List<List<Integer>> l1, List<Integer> l2, boolean[] freq){
        if(l2.size()==nums.length){
            l1.add(new ArrayList<>(l2));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                l2.add(nums[i]);
                freq[i]=true;
                helper(nums,l1,l2,freq);
                freq[i]=false;
                l2.remove(l2.size()-1);
            }
        }
    }
}