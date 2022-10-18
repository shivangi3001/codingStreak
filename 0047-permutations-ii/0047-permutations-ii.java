class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> l1 = new HashSet<>();
        List<Integer> l2 = new ArrayList<>();
        boolean[] freq = new boolean[nums.length]; 
        helper(nums, l1,l2,freq);
        List<List<Integer>>l3 = new ArrayList<>(l1);
        return l3;
    }
    public void helper(int[] arr, Set<List<Integer>> l1, List<Integer> l2, boolean[] freq){
        if(l2.size() == arr.length){
            l1.add(new ArrayList<>(l2)); return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                l2.add(arr[i]);  freq[i]=true;
                helper(arr,l1,l2,freq);
                l2.remove(l2.size()-1);  freq[i]=false;
            }
        }
    }
}