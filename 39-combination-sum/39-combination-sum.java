class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> l1 = new ArrayList<>();
        int l = candidates.length;
        // if(l==1 && target<candidates[0])  return l1;
        List<Integer> l2 = new ArrayList<>();
        
        helper(candidates,0,target,l1,l2);
        return l1;
    }
    
    public void helper(int[] arr, int idx, int t, List<List<Integer>> l1, List<Integer> l2){
        
        if(idx==arr.length){
            if(t==0)  l1.add(new ArrayList<>(l2));
            return;
        }
        
        if(arr[idx]<=t){
            l2.add(arr[idx]);
            helper(arr, idx, t-arr[idx], l1, l2);
            l2.remove(l2.size()-1);
        }
        helper(arr, idx+1, t, l1, l2);
    }
}