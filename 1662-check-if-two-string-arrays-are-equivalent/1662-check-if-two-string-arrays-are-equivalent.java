// Runtime: 0 ms, faster than 100.00%   and  Memory Usage: 40 MB, less than 96.44%
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //boolean flag=false;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        for(String i : word1) s1.append(i);
        for(String i : word2) s2.append(i);
        //String str1=s1.toString();    String str2=s2.toString();
        
        //System.out.println(str1+"->"+str2);
        // if(str1.equals(str2)) return true;
        // return false;
        return s1.toString().equals(s2.toString());
    }
}

// removing variable boolean flag -- then --> Runtime: 1 ms, faster than 95.64%
//     Memory Usage: 41.6 MB, less than 78.48% 