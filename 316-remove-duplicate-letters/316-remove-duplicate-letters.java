class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean exist[] = new boolean[26];
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']--;
            
            if(exist[ch-'a']) continue;
            while(st.size()>0 && st.peek()>ch && freq[st.peek()-'a']>0){
                char ch1= st.pop();
                exist[ch1-'a']=false;
            }
            st.push(ch);
            exist[ch-'a']=true;
        }    
        String s1 = "";
        while(st.size()>0){
            s1=st.pop()+s1;
        }
        return s1;
        
//         boolean[] arr = new boolean[26];
//         int len = s.length();
//         if(len==1)   return s;
        
//         Queue<Character> q1 = new ArrayDeque<>();
//         HashMap<Character, Integer> hm = new HashMap<>();
        
//         for(char ch : s.toCharArray()){
//             if(!hm.containsKey(ch))   hm.put(ch,1);
//             else   hm.put(ch, hm.get(ch)+1);
//             // hm.put(ch, hm.getOrDefault(ch,0)+1);
//         }
        
//         char ch = s.charAt(0);
//         arr[ch-'a']=true;
//         hm.put(ch, hm.get(ch)-1);
//         q1.add(ch);
//         System.out.println(hm);
//         System.out.println(hm.get(q1.peek()));             System.out.println(q1.peek());
        
//         for(int i=1;i<len;i++){
//             if(q1.peek() > s.charAt(i) && hm.get(q1.peek())>0){
//                 q1.remove();  q1.add(s.charAt(i));   hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
//             }
//         }
//     return s;
        
    }
}