// leetcode daily challenge - 4th April

// Runtime:  36 ms    Beats: 51.66%
class Solution {
    public int partitionString(String s) {
        int c=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(hm.containsKey(ch)){
                c++;
                hm = new HashMap<>();
                hm.put(ch,1);
            }
            else       hm.put(ch,1);
        }
        return c+1;
    }
}

// // abacaba  -->  
// // for(char ch : s.toCharArray){
//     if(freq[ch-'a']==0)  freq[ch-'a']++;
//     if(freq[ch-'a'] != 0){
//         c++;  freq[ch-'a'] = 1;
//     }
    
// }