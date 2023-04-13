// leetcode daily challenge - 13th April

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;

        Stack<Integer> st = new Stack<>();
        int j=0;
        for(int i : pushed) {
            st.push(i);
            while( !st.isEmpty() && st.peek() == popped[j] ) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}