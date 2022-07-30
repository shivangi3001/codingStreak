// testcases
// ["amazon","apple","facebook","google","leetcode"]
// ["e","o"]

// ["amazon","apple","facebook","google","leetcode"]
// ["l","e"]

// ["amazon","apple","facebook","google","leetcode"]
// ["lo","eo"]

// ["amazon","apple","facebook","google","leetcode"]
// ["e","oo"]


class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> list = new ArrayList<>();
        
        int[] target = new int[26];
        for(String i : words2){
            int[] temp = new int[26];
            for(char ch : i.toCharArray()){
                temp[ch-'a']++;
                target[ch-'a'] = Math.max(temp[ch-'a'], target[ch-'a']);
            }
        }
        
        for(String i : words1){
            int[] arr = new int[26];
            for(char ch : i.toCharArray())   arr[ch -'a']++;
            if(subset(arr,target))  list.add(i);
        }
        return list;
        
    }
    
    public static boolean subset(int[] arr, int[] target){
        for(int i=0;i<26;i++){
            if(target[i]>arr[i])   return false;
        }
        return true;
    }
        
//         brute force approach
//         HashMap<Character, Integer>hm1 = new HashMap<>();
//         for(String i : words2){
//             //String word2 = i;
//             for(char ch : i.toCharArray()){
//                 hm1.put(ch, 1);
//             }
//         }
//         //System.out.println(hm1);
        
//         HashMap<Character, Integer> hm2 = new HashMap<>();
//         for(String i: words1){
//             hm2 = keyVal(i);
//             boolean flag = compare(hm1,hm2);
//             //System.out.println(i+"->"+hm2+"->"+flag);
//             if(flag)  list.add(i);
//         }
        
//         return list;
//     }
    
//     public static boolean compare(HashMap<Character, Integer>hm1, HashMap<Character, Integer>hm2){
//         for(char i : hm1.keySet()){
//             if(!hm2.containsKey(i)) return false;
//             if(hm1.get(i) > hm2.get(i)) return false;
//         }
//         return true;
//     }
    
    
//     public static HashMap<Character, Integer> keyVal(String str){
//         HashMap<Character, Integer>hm1 = new HashMap<>();
//         for(char ch : str.toCharArray()){
//             hm1.put(ch, hm1.getOrDefault(ch, 0)+1);
//         }
//         return hm1;
//     }

}