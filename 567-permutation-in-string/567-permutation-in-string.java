// testcases----
// i/p -- "ab"   "eidbaooo"
// "ab"   "eidboaoo"
// "ab"  "eidoooba"
// "a"   "b"
// "a"   "a"
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();  int len2 = s2.length();    //len1=2    len2=8
        if(len1 == 1 && len2 == 1){
            if(s1.equals(s2))   return true;
            return false;
        }
        
        int[] freq1 = new int[26];      
        
        for(char ch : s1.toCharArray()){
            freq1[ch -'a']++;
        }
        for(int i=0;i<len2-len1+1;i++){    // len2-len1 --> 8-2 = 6
            int[] freq2 = new int[26];
            String s = s2.substring(i,len1+i);    //substring(0,2) --> (1,3) -->(5,7)
            for(char ch : s.toCharArray())  freq2[ch-'a']++;
            if(Arrays.equals(freq1, freq2))    return true;
        }
        return false;
    }
}