// testcases---
// i/p -- "23"
// ""
// "2"

// recursion - backtracking approach
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l1 = new ArrayList<>();
        int len = digits.length();
        if(len==0)  return l1;
        
        String[] maps = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        helper("", 0, maps, l1, digits);
        return l1;
    }
    
    public void helper(String str, int idx, String[] maps, List<String> l1, String digits){
        if(idx == digits.length()){
            l1.add(str);
            return;
        }
        
        String letter = maps[digits.charAt(idx) - '0'];
        for(int i=0;i<letter.length();i++){
            helper(str+letter.charAt(i), idx+1, maps, l1, digits);
        }
        
    }
}