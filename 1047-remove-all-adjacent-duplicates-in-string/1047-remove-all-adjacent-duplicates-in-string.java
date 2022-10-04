class Solution {
    public String removeDuplicates(String s) {
        int len = s.length();
        if(len == 1)  return s;
        Stack<Character> st1 = new Stack<>(); 
        // st1.push(s.charAt(0));
        
        for(char ch : s.toCharArray()){
            if(st1.size()>0 && st1.peek()==ch)  st1.pop();
            else   st1.push(ch);
        }
        // System.out.println(st1.peek()+"->"+st1.size());
        
        String s1 ="";
        while(st1.size()>0){
            char ch = st1.pop();
            s1 = ch+s1;
        }
        return s1;
    }
}