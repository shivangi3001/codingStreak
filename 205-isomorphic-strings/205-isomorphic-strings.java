// testcase
// "egg"   "add"
// "foo"    "bar"
// "paper"  "title"
// "aab"    "xxy"
// "aab"    "xyz"
// "aba"    "xyy"
// "badc"   "baba"

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l1=s.length();   int l2= t.length();
        if(l1 != l2)  return false;
        
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Boolean> hm1 = new HashMap<>();
        for(int i=0;i<l1;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!hm.containsKey(ch1)){
                if(hm1.containsKey(ch2))  return false;
                hm.put(ch1,ch2);   hm1.put(ch2,true);
            }  
            else{
                if(hm.get(ch1) != ch2) return false;
            }
        }
        return true;
    }
}