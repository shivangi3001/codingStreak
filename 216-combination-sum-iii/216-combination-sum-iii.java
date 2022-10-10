class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        if(n<k)  return l1;
        helper(1, k, n, l1, l2);
        return l1;
    }
    
    public void helper(int s, int k, int n, List<List<Integer>> l1, List<Integer> l2){
        if(l2.size() == k){
            if(n==0) l1.add(new ArrayList<>(l2));
            return;
        }
        
        for(int i=s;i<=9;i++){
            l2.add(i);
            helper(i+1, k, n-i, l1, l2);
            l2.remove(l2.size()-1);
        }
    }
}