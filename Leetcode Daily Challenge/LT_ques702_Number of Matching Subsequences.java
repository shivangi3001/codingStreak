// 792. Number of Matching Subsequences
// https://leetcode.com/problems/number-of-matching-subsequences/
// Leetcode daily challenge - 20th July2022


class Solution {
    Map<String,Boolean> map;
    public int numMatchingSubseq(String s, String[] words) {
        
//       Most optimised sol---O(n)  HashMap approach  --- my approach
        map = new HashMap<>();
        int count=0;
        for(String i : words){
            if(countSub(s,i))  count++;
        }
        return count;
    }
    
    public boolean countSub(String s, String w){
        // HashMap<String, Boolean> hm = new HashMap<>();
        int p1 = 0;
        int p2 = 0;
        
        while(p1<s.length()){
            if(s.charAt(p1) == w.charAt(p2)){
                p1++;  p2++;
            }
            else p1++;
            if(p2==w.length() && p1<=s.length()){
                map.put(w,true);
                return true;
            }
        }
        map.put(w,false);
        return false;
        
    }
        
        
//        LCS DP approach----time complexity O(n^2)
//         int count=0;
//         for(String i : words){
//             int a = lcsDP(s,i);
//             count += a;
//             // System.out.println(i+"->c: "+count);
//         }
//         // System.out.println("c: "+count);
//         return count;
//     }
    
//     public int lcsDP(String s1, String s2){
//         int l1 = s1.length();    int l2 = s2.length();
//         int[][] dp = new int[l1+1][l2+1];
//         for(int i=l1-1;i>=0;i--){
//             for(int j=l2-1;j>=0;j--){
//                 char c1 = s1.charAt(i);   char c2 = s2.charAt(j);
//                 if(c1 == c2)  dp[i][j] = 1 + dp[i+1][j+1];
//                 else   dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
//             }
//         }
//         // System.out.println(dp[0][0]+"=>");
        
//         if(dp[0][0] > 0 && l2 == dp[0][0]) return 1;
//         else return 0;
//     }
        
        
//         BruteForce Hashmap approach
   //      int count=0;
   //      HashMap<Character, Integer> hm = new HashMap<>();
   //      for(int i=0;i<s.length(); i++){
   //          char ch = s.charAt(i);
   //          if(hm.containsKey(ch))   
   //              hm.put(ch, hm.get(ch)+1);
   //          else   hm.put(ch, 1);
   //      } 
   //      // System.out.println(hm);
   //      for(String str : words){
   //          HashMap<Character, Integer> hm1 = co(str);
   //          // System.out.println(str+"-> hm1: "+hm1);
   //          boolean flag=false;
   //          for(Character i : hm1.keySet()){
   //              if(hm.containsKey(i) && hm.get(i)>=hm1.get(i)) flag=true;
   //              else { flag=false;  break;  }
   //          }
   //          if(flag) count++;
   //          // System.out.println(count);
   //      }
   //      return count;
   //  }
   // public HashMap<Character,Integer> co(String str){
   //     HashMap<Character, Integer> hm = new HashMap<>();
   //     for(int i=0;i<str.length();i++){
   //         char ch = str.charAt(i);
   //         if(hm.containsKey(ch)) hm.put(ch, hm.get(ch)+1);
   //         else hm.put(ch,1);
   //     }
   //     return hm;
   // }

}