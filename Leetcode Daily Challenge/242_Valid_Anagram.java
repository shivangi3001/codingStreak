class Solution {
    public boolean isAnagram(String s, String t) {
// optimised approach
//         if(s.length() != t.length()) return false;
//         HashMap<Character, Integer> m1 = new HashMap<>();
//         for(char ch : t.toCharArray()){
//             if(!m1.containsKey(ch)) m1.put(ch,1);
//             else{
//                 int a = m1.get(ch);
//                 m1.put(ch,a+1);
//             }
//         }
        
//         for(char al : s.toCharArray()){
//             if(!m1.containsKey(al) || m1.get(al) == 0 || m1.size() == 0) return false;
//             else{
//                 int a = m1.get(al);
//                 m1.put(al, a-1);
//             }
//         }
//         return true;
        
// my hashmap approach
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            h1.put(ch, h1.getOrDefault(ch, 0) +1 );
        }
        // System.out.println(h1);

        
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            h2.put(ch, h2.getOrDefault(ch, 0) +1 );
        }
        // System.out.println(h2);
        
        for(Character i : h1.keySet()){
            if(h2.containsKey(i)){
                int freq1 = h1.get(i);    int freq2 = h2.get(i);
                if(freq1 == freq2){  h1.put(i,0);  h2.remove(i);   }
                else{
                    h1.put(i, h1.get(i)-1);    h2.put(i, h2.get(i)-1);
                }
            }
        }
        // System.out.println(h1);   System.out.println(h2);
        if(h2.size() != 0)  return false;
        for(Character i : h1.keySet()){
            if(h1.get(i) > 0) return false;
        }
        // if(h1.size() != 0 || h2.size() != 0)  return false;
       return true;
    }
}