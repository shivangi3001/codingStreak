// 792. Number of Matching Subsequences
// https://leetcode.com/problems/number-of-matching-subsequences/
// Leetcode daily challenge - 20th July2022

// Brute Force Approach


class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch))   
                hm.put(ch, hm.get(ch)+1);
            else   hm.put(ch, 1);
        } System.out.println(hm);
        for(String str : words){
            HashMap<Character, Integer> hm1 = co(str);
            System.out.println(str+"-> hm1: "+hm1);
            boolean flag=false;
            for(Character i : hm1.keySet()){
                if(hm.containsKey(i) && hm.get(i)>=hm1.get(i)) flag=true;
                else { flag=false;  break;  }
            }
            if(flag) count++;
            System.out.println(count);
        }
        return count;
    }
   public HashMap<Character,Integer> co(String str){
       HashMap<Character, Integer> hm = new HashMap<>();
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(hm.containsKey(ch)) hm.put(ch, hm.get(ch)+1);
           else hm.put(ch,1);
       }
       return hm;
   }

}