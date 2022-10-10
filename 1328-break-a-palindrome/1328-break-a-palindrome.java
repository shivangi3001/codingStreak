// testcases
// "abccba"
// "a"
// "madam"
// "bab"
// "babab"
// "aa"
// "aaaa"

// brute force approach failed for testcases like---"aa"  "aaaa"
class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len == 1) return "";
        
//         String s1 = ""; 
//         if(palindrome.charAt(0) != 'a') s1=s1+"a"+palindrome.charAt(1);
//         else s1=palindrome.charAt(0)+"a";
        
//         for(int i=2;i<len;i++) s1 = s1+palindrome.charAt(i);
        
//         return s1;
        char[] arr = palindrome.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != 'a'){
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[arr.length-1] = 'b';
        return String.valueOf(arr);
    }
}