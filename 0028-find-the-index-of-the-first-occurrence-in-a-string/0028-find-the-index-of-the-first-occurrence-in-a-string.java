// leetcode daily challenge - 3rd March 2023

// Runtime: 0 ms  Beats: 100%

class Solution {
    public int strStr(String haystack, String needle) {

        boolean flag = haystack.contains(needle);
        if(!flag)  return -1;

        int len1=haystack.length();   int len2=needle.length();

        for(int i=0;i<len1-len2+1;i++){
            String s1 = haystack.substring(i, i+len2);
            if(s1.equals(needle)) return i;

        }
        return -1;
    }
}