// testcases---
// i/p --> "aab"
// "a"
// "ab"
// "ababbbabbababa"
// "aaabba"

// got tle error for --> "fifgbeajcacehiicccfecbfhhgfiiecdcjjffbghdidbhbdbfbfjccgbbdcjheccfbhafehieabbdfeigbiaggchaeghaijfbjhi"
// recursive bactracking approach
class Solution {
    public int minCut(String s) {
        int len = s.length();
        if(len == 1 || isPalind(s,0,len-1)) return 0;
        
        int dp[]=new int[len];
        Arrays.fill(dp,-1);
        return helper(0, s, dp)-1;
    }
    
    public int helper(int idx, String s, int[] dp){
        int len = s.length();
        if(idx==len)  return 0;
        
        if(dp[idx]!=-1) return dp[idx];  //memoization
        
        int minCost=Integer.MAX_VALUE;
        for(int j=idx; j<len;j++){
            if(isPalind(s,idx,j)){
                int cost = 1+ helper(j+1, s, dp);
                minCost = Math.min(minCost,cost);
            }
        }
        return dp[idx]= minCost;
    }
    
    public boolean isPalind(String str, int l, int r){
        while(l<r){
            if(str.charAt(l) != str.charAt(r))  return false;
            l++;   r--;
        }
        return true;
    }
}