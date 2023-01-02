class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        char ch1=word.charAt(0);     //String s =""+ch1;

        int upper=0,lower=0;

        for(char ch : word.toCharArray()){
            // String str =""+ch;
            if(Character.isUpperCase(ch)) upper++;
            if(Character.isLowerCase(ch)) lower++;
        }
        if(upper==len || lower==len) return true;
        if(Character.isUpperCase(ch1) && lower==len-1) return true;
        return false;
    }
}