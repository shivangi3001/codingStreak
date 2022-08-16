// Brute force approach -- runtime 47ms 
class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
// corner testcase...incase len of string is 1 return 0 because only 1 char present
        if(len == 1) return 0;
        
// next traversing through string array and storing freq of each char
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(hm.containsKey(ch))  hm.put(ch, hm.get(ch)+1);
            else hm.put(ch,1);
        }
        // System.out.println(hm);
        
// now traversing through string array and checking the first char whose val in hashmap == 1
// returning the index of the same 
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(hm.get(ch)==1) return i;
        }
        // in case no non-repaeating char found return -1
        
        return -1;
    }
}