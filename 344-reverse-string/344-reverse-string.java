class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int l=0;   int r=len-1;
        while(l<=r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;   r--;
        }
//         int len = s.length;
//         ArrayList<Character> list = new ArrayList<>();
//         // char s1 = new char[len];
//         for(int i=len-1;i>=0;i--){
//             list.add(s[i]);
//         }
        
//         System.out.println(list);
//         // for(int i=0;i<len;i++) System.out.print(s1);
        
//         int sos=0;   int eos=s.length-1;
//         while(sos<eos){
//             String temp = s[sos];
//             s[sos] = s[eos];
//             s[eos] =temp;
//             sos++;   eos--;
//         }
//         System.our.println(s);
        
    }
}