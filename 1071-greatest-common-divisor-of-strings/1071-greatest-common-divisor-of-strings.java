// daily leetcode challenge -> 1st Feb 2023

// Runtime 1 ms       Beats 85.83%
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 == len2){
            if(str1.equals(str2))   return str1;
            else return "";
        }

        String a = str1+str2;
        String b = str2+str1;
        if(a.equals(b)) return a.substring(0, gcd(str1.length(), str2.length()));
        else return "";
        // if(len2<len1){
        //     for(int i=0;i<=len1-len2;i++){
        //         String a = str1.substring(i,i+len2);
        //         if(str2.equals(a))  return 
        //     }
        // }
    }

    public int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
}