// testcase --"abcde"   "cdeab"
// "abcde"   "abced"
// "a"   "a"
// "a"   "b"

// approach-1
// Runtime: 27 ms, faster than 5.69%     Memory Usage: 43.2 MB, less than 5.99%
// class Solution {
//     public boolean rotateString(String s, String goal) {
//         int len1 = s.length();      int len2 = goal.length();
//         if(len1 != len2)   return false;
        
//         for(int i=0;i<len1;i++){
//             String s1 = s.substring(0,i+1);
//             String s2 = "";
//             if(i+1<len1){  s2 = s.substring(i+1, len1);    }
//             String s3 = s2+s1;
//             System.out.println(s1+"->"+s2+"->"+s3);
//             if(s3.equals(goal))  return true;
//         }
//         return false;
//     }
// }


// approach2 ---- sliding window approach ---> s+s
class Solution {
    public boolean rotateString(String s, String goal) {
        int len1 = s.length();      int len2 = goal.length();
        if(len1 != len2)   return false;
        
        String s1 = s+s;         System.out.println(s1);
        int len = s1.length();              // s=abcde    s1=abcdeabcde    len=10   len1=5
        for(int i=0;i<=len-len1;i++){      //len-len1     10-5=5  
            String s2 = s1.substring(i, len1+i);      //(0,5)...(1,6)....(5,10)
            if(s2.equals(goal))   return true;    
        }
        return false;
    }
}