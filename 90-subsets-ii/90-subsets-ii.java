// testcases--
// I/p -- [1,2,2]      O/p --  [[1,2,2],[1],[2,2],[2],[],[1,2]]
// [0]                         [[],[0]]
// [4,4,4,1,4]                 [[],[1],[1,4],[1,4,4],[1,4,4,4],[1,4,4,4,4],[4],[4,4],[4,4,4],[4,4,4,4]]

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> l1 = new HashSet<>();   // took hashset to avoid dublicate subsets
        List<Integer> l2 = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,l1,l2);
        List<List<Integer>> list = new ArrayList<>(l1);  // converlist set to list
        return list;
    }
    
    public void helper(int idx, int[] arr, Set<List<Integer>>l1, List<Integer> l2){
        if(idx==arr.length){
            l1.add(new ArrayList<>(l2));   return;
        }
        
        helper(idx+1, arr, l1, l2);   // when not take element
        
        l2.add(arr[idx]);
        helper(idx+1, arr, l1, l2);   // take element
        l2.remove(l2.size()-1);
        
        // for(int i=idx;i<arr.length;i++){
        //     if(i!=idx && arr[i]==arr[i-1]) continue;
        //     l2.add(arr[i]);
        //     helper(i+1,arr,l1,l2);
        //     l2.remove(l2.size()-1);
        // }        
    }
}