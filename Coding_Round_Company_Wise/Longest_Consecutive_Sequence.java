// Leetcode ques link - https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i : nums){
            hs.add(i);
        }
        System.out.println(hs);
        int streak=0;    int maxi =0;  int currNum;
        
        for(int i : nums){
           if(!hs.contains(i-1)){
               currNum = i;
               maxi = 1;
               
               while(hs.contains(currNum+1)){
                   currNum +=1;
                   maxi +=1;
               }
               streak = Math.max(maxi, streak);
           } 
        }
        return streak;
    }
        
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i : nums){
//             if(hm.containsKey(i))  hm.put(i, hm.get(i)+1);
//             else    hm.put(i,1);
//         }
//         System.out.println(hm);
        
//         HashMap<Integer, Boolean> hm1 = new HashMap<>();
//         for(int i : hm.keySet()){
//             if(hm.containsKey(i-1)){
//                 hm1.put(i, false);
//             }else{
//                 hm1.put(i, true);
//             }
//         }
//         System.out.println(hm1);
//         int ans = counts(hm1);
//         return ans;
        
//         // int count=0;  int max = Integer.MIN_VALUE;
//         // for(int i : hm1.keySet()){
//         //     if(hm1.get(i)){
//         //         while(hm1.containsKey(i+1))
//         //     }
//         // }   
//     }
    
//     public int counts(HashMap<Integer, Boolean>hm1){
//         int count=0; int max = Integer.MIN_VALUE;
//         for(int i : hm1.keySet()){
//             if(hm1.get(i)){
//                 while(hm1.containsKey(i+1))  count++;
//             }
//         }
//         if(count>max) max = count;
//         return max;
//     }
    
}