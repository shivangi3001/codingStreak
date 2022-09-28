class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        helper(0,s,l1,l2);
        return l1;
        
    }
    
    public void helper(int idx, String s, List<List<String>> l1, List<String> l2){
        if(idx==s.length()){
            l1.add(new ArrayList<>(l2));
            return;
        }
        
        for(int i=idx;i<s.length();++i){
            if(isPalind(s,idx,i)){
                l2.add(s.substring(idx,i+1));
                helper(i+1,s,l1,l2);
                l2.remove(l2.size()-1);
            }
        }
    }
    
    public boolean isPalind(String s, int l, int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}