// Runtime: 0 ms    Beats: 100%

class Solution {
    public boolean checkString(String s) {
        int bCount=0;
        int len=s.length();

        for(char ch : s.toCharArray()){
            if(bCount>0 && ch=='a')   return false;
            if(ch == 'b') bCount++;
        }
        return true;
    }
}