// leetcode daily challenge -> 2nd Feb

// Runtime:  21 ms    Beats:  5.86%
class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        int[] freq = new int[26];
        int seq=0;
        for(int i=0;i<26;i++){
            freq[order.charAt(i) - 'a'] = seq++;
            System.out.println(order.charAt(i) - 'a'+" "+freq[order.charAt(i) - 'a']+" "+order.charAt(i));
        }

        for(int i=1;i<words.length;i++){
            System.out.println(Math.min(words[i-1].length(), words[i].length()));
            for(int j=0;j<Math.min(words[i-1].length(), words[i].length());j++){
                char ch1 = words[i-1].charAt(j);
                char ch2 = words[i].charAt(j);
                System.out.println(ch1+" "+ch2+" "+freq[ch1-'a']+" "+freq[ch2-'a']);
                if(ch1 != ch2){
                    if( freq[ch1-'a'] > freq[ch2-'a'] ) return false;
                    else{
                        if(i==words.length-1)   return true;
                        break;
                    }
                }
                if(j==Math.min(words[i-1].length(), words[i].length())-1 && words[i-1].length() > words[i].length() )  return false;
            }
            // if( words[i-1].length() > words[i].length() )   return false;
        }
        return true;
    }
}
// testcase - 
// ["fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"]
// order = "zkgwaverfimqxbnctdplsjyohu"

// ["kruw","ha","q"]
// order = "zgxlkthsjuoqcpavbfdermiywn"