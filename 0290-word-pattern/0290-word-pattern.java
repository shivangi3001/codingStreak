class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] words = s.split(" ");
       if(words.length != pattern.length())  return false;

       HashMap<Character, String> hm = new HashMap<>();
       for(int i=0;i<pattern.length();i++){
           char ch = pattern.charAt(i);
           if(hm.containsKey(ch)){
               if(!hm.get(ch).equals(words[i]))   return false;
           }
           else{
               if(hm.containsValue(words[i])) return false;
               hm.put(ch, words[i]);
           }
       } 
       return true;
    }
}

// testcase 
// "abba"
// "dog dog dog dog"