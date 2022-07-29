class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
//         brute force approach
//         HashMap<Character, Integer> hm1 = new HashMap<>();
//         for(char ch : pattern.toCharArray()){
//             if(hm1.containsKey(ch))   hm1.put(ch, hm1.get(ch)+1);
//             else hm1.put(ch,1);
//         }
//         int si = hm1.size();
//         System.out.println(hm1+"->"+si);
//         ArrayList<String> l1 = new ArrayList<>();
        
//         HashMap<String, HashMap<Character, Integer>> hm2 = new HashMap<>();
//         for(String i : words){
//             String word = i;
//             HashMap<Character, Integer> hm3 = new HashMap<>();
//             // HashMap<Character, Integer> hm2 = new HashMap<>();
//             for(char ch : word.toCharArray()){
//                 if(hm3.containsKey(ch))  hm3.put(ch, hm3.getOrDefault(ch, 0)+1);
//                 else hm3.put(ch, 1);
//             }
//             hm2.put(i, hm3);
//             if(hm3.size() == hm1.size())  l1.add(i);
//         }
//         System.out.println("hm2->"+hm2);
//         // System.out.println("list->"+l1); 
//         return l1;
        
        
//      optimised approach
        ArrayList<String> list = new ArrayList<>();
        for(String i : words){
            boolean flag = find(i, pattern);
            if(flag)  list.add(i);
        }
        return list;
    }
    
    public static boolean find(String a, String b){
        for(int i=0;i<a.length();i++){
            if(a.indexOf(a.charAt(i))  !=  b.indexOf(b.charAt(i)) )   return false;
        }
        return true;
    }
}