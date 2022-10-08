class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len ==1){
            if(nums[0]== target)  return 0;
            else return -1;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i : nums)  list.add(i);
        if(list.contains(target))  return list.indexOf(target);
        return -1;
    }
}