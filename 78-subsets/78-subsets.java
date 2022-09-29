class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        helper(0,nums,l1,l2);
        return l1;
    }
    
    public void helper(int idx, int[] arr, List<List<Integer>> l1, List<Integer> l2){
        if(idx==arr.length){
            l1.add(new ArrayList<>(l2));   return;
        }
        
        helper(idx+1,arr,l1,l2);
        l2.add(arr[idx]);
        helper(idx+1,arr,l1,l2);
        l2.remove(l2.size()-1);
        // for(int i=idx;i<arr.length;i++){
        //     l2.add(arr[i]);
        //     helper(i+1,arr,l1,l2);
        //     l2.remove(l2.size()-1);
        // }
        //helper(idx+1,arr,l1,l2);
    }
}