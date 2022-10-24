class Solution {
    public int maxLength(List<String> arr) {
//         int n = arr.size();
//         if(n==1){
//             String str = arr.get(0);
//             return str.length();
//         }
        
//         int overMax=0;
            
//         HashMap<Character, Integer> m1 = new HashMap<>();
//         for(String i : arr){
//             String word = i;    System.out.println("str->"+i);
//             for(int j=0;j<word.length();j++){
//                 char ch = word.charAt(j);   System.out.println("->"+ch);
//                 if(!m1.containsKey(ch))  m1.put(ch,1);
//                 else break;
//             }
//             System.out.println(m1.size());
//         }
//         return m1.size();

            return solve(0,arr,"");
    }
    
    public int solve(int idx, List<String>arr, String s){
        if(idx==arr.size()){
            if(isValid(s))   return s.length();
            return 0;
        }
        
        int pick = solve(idx+1, arr, s+arr.get(idx));
        int notPick = solve(idx+1,arr,s);
        
        return Math.max(pick, notPick);
    }
    
    public boolean isValid(String s){
        int len=s.length();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']>1)  return false;
        }
        return true;
    }
}