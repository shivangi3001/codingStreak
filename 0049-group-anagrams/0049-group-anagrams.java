class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> l1 = new ArrayList<>();
//         List<String> l2 = new ArrayList<>();
        
//         int len = strs.length;
//         if(len == 0){
//             l2.add("");
//             l1.add(new ArrayList<>(l2));    return l1;
//         }
        
//         // l2.add("zzz");
//         // l1.add(new ArrayList<>(l2));
//         // return l1;
//         int[] freq1 = new int[26];
//         for(char ch : strs[0].toCharArray()) freq1[ch-'a']++; 
//         l2.add(strs[0]);
            
//         for(int i=1;i<strs.length;i++){
//             int[] freq2 = new int[26];
//             for(char ch : strs[i].toCharArray()) freq2[ch - 'a']++;
//             if(freq1.equals(freq2)){
//                 l2.add()
//             }
//         }
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}