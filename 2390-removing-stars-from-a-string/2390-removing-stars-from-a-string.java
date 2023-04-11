// leetcode daily challenge - 11th april

class Solution {
    public String removeStars(String s) {
        int len = s.length();

        if(len == 1){
            if(s.charAt(0) == '*')  return "";
            return s;
        }

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != '*') st.push(ch);
            else{
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        return sb.toString();
    }
}