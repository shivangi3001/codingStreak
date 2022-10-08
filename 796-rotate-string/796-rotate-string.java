// testcase --"abcde"   "cdeab"
// "abcde"   "abced"
// "a"   "a"
// "a"   "b"

// approach-1
class Solution {
    public boolean rotateString(String s, String goal) {
        int len1 = s.length();      int len2 = goal.length();
        if(len1 != len2)   return false;
        
        for(int i=0;i<len1;i++){
            String s1 = s.substring(0,i+1);
            String s2 = "";
            if(i+1<len1){  s2 = s.substring(i+1, len1);    }
            String s3 = s2+s1;
            System.out.println(s1+"->"+s2+"->"+s3);
            if(s3.equals(goal))  return true;
        }
        return false;
    }
}