// testcases---
// i/p --> "aab"
// "a"
// "ab"
// "ababbbabbababa"
// "aaabba"

// got tle error for --> "fifgbeajcacehiicccfecbfhhgfiiecdcjjffbghdidbhbdbfbfjccgbbdcjheccfbhafehieabbdfeigbiaggchaeghaijfbjhi"
// recursive bactracking approach

// did modification in recursive code-> converted to memoized code
// Runtime: 1551 ms, faster than 32.20%   Memory Usage: 40.2 MB, less than 96.35%
// class Solution {
//     public int minCut(String s) {
//         int len = s.length();
//         if(len == 1 || isPalind(s,0,len-1)) return 0;
        
//         int dp[]=new int[len];
//         Arrays.fill(dp,-1);
//         return helper(0, s, dp)-1;
//     }
    
//     public int helper(int idx, String s, int[] dp){
//         int len = s.length();
//         if(idx==len)  return 0;
        
//         if(dp[idx]!=-1) return dp[idx];  //memoization
        
//         int minCost=Integer.MAX_VALUE;
//         for(int j=idx; j<len;j++){
//             if(isPalind(s,idx,j)){
//                 int cost = 1+ helper(j+1, s, dp);
//                 minCost = Math.min(minCost,cost);
//             }
//         }
//         return dp[idx]= minCost;
//     }
    
//     public boolean isPalind(String str, int l, int r){
//         while(l<r){
//             if(str.charAt(l) != str.charAt(r))  return false;
//             l++;   r--;
//         }
//         return true;
//     }
// }

class Solution {
    public int minCut(String s) {
        int len = s.length();
        
        int[] dp = new int[len+1];
        
        dp[len]=0;
        
        for(int i=len-1;i>=0;i--){
            int minCost=Integer.MAX_VALUE;
            for(int j=i;j<len;j++){
                if(isPalind(s,i,j)){
                    int cost = 1+dp[j+1];
                    minCost = Math.min(minCost,cost);
                }
            }
            dp[i]=minCost;
        }
        return dp[0]-1;
    }
    
    public boolean isPalind(String str, int l, int r){
        while(l<r){
            if(str.charAt(l) != str.charAt(r))  return false;
            l++;   r--;
        }
        return true;
    }
}