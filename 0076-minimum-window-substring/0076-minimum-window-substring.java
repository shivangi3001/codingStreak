// testcases--> "ADOBECODEBANC"  "ABC"
// "a"       "a"
// "a"       "aa"
// "ABCDEF"  "abc"

class Solution {
    public String minWindow(String s, String t) {
        int lens=s.length();    int lent=t.length();
        if(s.equals(t))  return s; 
        String str = "";
        if(lens<lent)  return str;
        
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for(char ch : t.toCharArray()){
            hm1.put(ch, hm1.getOrDefault(ch,0)+1);
        }
        //System.out.println(hm1);
        
        int matchCount=0;  int desiredCount=lent;
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int i=-1, j=-1;
        
        while(true){
            boolean f1 = false;     boolean f2 = false;
        // acquire
            while(i<lens-1 && matchCount<desiredCount){
                i++; char ch = s.charAt(i);
                hm2.put(ch, hm2.getOrDefault(ch,0)+1);
                
                if(hm1.getOrDefault(ch,0) >= hm2.getOrDefault(ch, 0)) matchCount++;
                f1=true;
            }
            
        // collect  answers and then release
            while(j<i && matchCount == desiredCount){
                String potentialAns = s.substring(j+1,i+1);
                if(str.length() == 0 || potentialAns.length() < str.length())  str = potentialAns;
            
                j++;   char ch =s.charAt(j);
                if(hm2.get(ch) == 1)  hm2.remove(ch);
                else  hm2.put(ch, hm2.get(ch)-1);

                if(hm2.getOrDefault(ch,0) < hm1.getOrDefault(ch,0))  matchCount--;
                f2=true;
            }
            if(f1==false && f2==false)  break;
        }
        
        
        return str;   //return "xyz";
    }
}