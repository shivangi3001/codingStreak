// Runtime 0 ms      Beats 100%
class Solution {
    public int lengthOfLastWord(String s) {
        int n=0;
        // "   fly me   to   the moon  "

        int len=s.length();

        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) != ' ') n++;
            else{
                if(n>0)  return n;   //if already encountered char then length...
                // if all spaces till now then continue
            }
        }
        return n;   // incase of words with no space like "hello""
    }
}