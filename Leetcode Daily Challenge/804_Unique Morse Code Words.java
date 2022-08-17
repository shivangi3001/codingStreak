// runtime 3ms faster than 80% java online submissions
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
//  corner or base case when only 1 word present -> only 1 transformation possible by default
        int len = words.length;
        if(len == 1)  return 1;
        
//   storing the code in morse string array
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

// using hashset to store unqiue transformations and 
// returning the size of hashset gives the answer
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<len;i++){
            String w = words[i];
            String s1="";
            for(int j=0;j<words[i].length();j++){
                char ch = w.charAt(j);
                
                s1 += ""+morse[ch-'a'];
                // System.out.print(ch+"->"+s1);
            }
            hs.add(s1);
            // System.out.println();
        }
        // System.out.println(hs);
        
        return hs.size();
    }
}

// few print statements commented in the code can be 
// used for better dugugging and proper understanding of code