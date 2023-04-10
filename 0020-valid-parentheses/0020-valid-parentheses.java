class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        char ch1 = s.charAt(0);
        char chLast = s.charAt(len-1);
        if( len == 1 || ch1 == ')' || ch1 == '}' || ch1==']') return false;
        if(chLast == '(' || chLast == '{' ||chLast == '[' ) return false;
        
        boolean val = false;
        Stack <Character> st = new Stack <> ();
        for(int i=0;i<len;i++){
            Character ch = s.charAt(i);
            if(ch == ')' || ch == '}' || ch==']'){
                if(st.size() == 0) { val=false; break;}
                if(st.peek() == '('  && ch == ')' )   { st.pop();   val=true; }
                else if(st.peek() == '{'  && ch == '}' ) { st.pop();   val=true; }
                else if(st.peek() == '['  && ch == ']' ) { st.pop();   val=true; }
                else { val = false; break; }
            }
            else st.push(ch);
        }
        if(st.size() != 0) val = false; 
        return val;
    }
}