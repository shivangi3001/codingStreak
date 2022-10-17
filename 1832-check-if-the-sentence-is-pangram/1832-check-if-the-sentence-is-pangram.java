class Solution {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        
        if(len<26) return false;
        
        int[] freq = new int[26];
        for(char ch : sentence.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]<1) return false;
        }
        return true;
    }
}