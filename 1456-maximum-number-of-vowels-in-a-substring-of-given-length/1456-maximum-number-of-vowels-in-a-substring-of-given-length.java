// daily leetcode challenge - 5th MAy
class Solution {
    public int maxVowels(String s, int k) {
        // int n = s.length();

        // int i=0, count=0;
        int vow = 0;

        for(int i=0;i<k;i++){
            if(isVow(s.charAt(i)))  vow++;
        }
        int max = vow;
        for(int i=k; i<s.length(); i++){
            if(isVow(s.charAt(i))) vow++;
            if(isVow(s.charAt(i-k))) vow--;
            max = Math.max(max, vow);
        }
        return max;
    }
    private boolean isVow(char c){
        if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
        return false;
    }
}