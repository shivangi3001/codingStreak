// leetcode daily challenge -> 28th April

// Runtime: 27 ms   Beats: 50%
// dfs approach
class Solution {
    public int numSimilarGroups(String[] strs) {
        int result=0;

        if(strs==null || strs.length==0)    return 0;

        Set<String> vis = new HashSet<>();
        for(String s : strs){
            if(!vis.contains(s)){
                dfs(s, strs, vis);
                result++;
            }
        }
        return result;
    }
    void dfs(String curr, String[] strs, Set<String> vis){
        if(vis.contains(curr))   return;

        vis.add(curr);

        for(int i=0;i<strs.length;i++){
            if(isSim(curr, strs[i]))  dfs(strs[i], strs, vis);
        }
    }

    boolean isSim(String s1, String s2){
        int c=0;
        for(int i=0;i<s1.length();i++){
             if(s1.charAt(i) != s2.charAt(i)){
                c++;
                if(c>2)   return false;
             } 
        }
        return c==2 || c==0;
    }
}

// approach -> string nested for loop -> character by character comparison
// class Solution {
//     public int numSimilarGroups(String[] strs) {
//         int len = strs.length;
//         if(len == 1)  return len;

//         int c=0;
//         boolean[] flag = new boolean[len];
//         flag[0]=false;
//         for(int i=0;i<len;i++){
//             for(int j=i+1;j<len;j++){
//                 boolean check = isSim(strs[i], strs[j]);
//                 if(flag[j] != true)  flag[j]=check;
//             }
//         }
//         for(int i=0;i<len;i++){
//             if(!flag[i])  c++;
//         }
//         return c;
//     }

//     public boolean isSim(String s1, String s2){
//         int count=0;
//         for(int i=0;i<s1.length();i++){
//             if(s1.charAt(i) != s2.charAt(i)) count++;
//         }
//         if(count <= 2) return true;
//         return false;
//     }
// }