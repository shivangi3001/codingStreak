// Runtime: 182 ms   Beats: 9.65%      Memory 73.3 MB   Beats  10.13%
class Solution {
    public int longestPalindromeSubseq(String s) {
        
        String s1 = new String();
        s1 = reverse(s);
        //System.out.println(s+" "+s1);

        int n=s.length();   int m=s1.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] i : dp )   Arrays.fill(i,-1);

        for(int i=0;i<=n;i++)   dp[i][0]=0;
        for(int j=0;j<=m;j++)   dp[0][j]=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1) == s1.charAt(j-1))  dp[i][j]=1+dp[i-1][j-1];
                else    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public String reverse(String s){
        String s1 = new String();
        for(int i=s.length()-1;i>=0;i--)  s1=s1+s.charAt(i);
        return s1;
    }
}


// class Solution {
//     public int longestPalindromeSubseq(String s) {
        
//         return helper(0, s, 0);
//     }

//     public int helper(int idx, String s, int sum){
//         // if(idx == s.length())  return sum;

//         for(int i=idx;i<s.length();i++){
//             if(isPalind(idx, i, s))  sum = Math.max(sum, i-idx);
//         }
//         return sum;
//     }

//     public boolean isPalind(int l, int r, String s){
//         while(l<=r){
//             if(s.charAt(l) != s.charAt(r) )   return false;
//         }
//         return true;
//     }
// }