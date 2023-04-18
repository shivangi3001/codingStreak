class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        StringBuilder sb = new StringBuilder();

        int i=0, j=0;
        while(i<l1 && j<l2){
            sb.append(""+word1.charAt(i++));
            sb.append(""+word2.charAt(j++));
        }
        while(i<l1)  sb.append(""+word1.charAt(i++));
        while(j<l2)  sb.append(""+word2.charAt(j++));

        return sb.toString();

    }
}