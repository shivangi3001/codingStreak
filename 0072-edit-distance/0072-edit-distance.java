// my recursive code---> just passed public testcases
// didnt consider --> operations part and min operations thing
// class Solution {
//     public int minDistance(String word1, String word2) {
//         int n=word1.length();    int m=word2.length();

//         return helper(n-1, m-1, word1, word2);
//     }

//     public int helper(int i, int j, String s1, String s2){
//         if(i==0)  return 1;

//         if(s1.charAt(i) != s2.charAt(j))  return 1+helper(i-1,j,s1,s2);
//         return  helper(i-1,j-1,s1,s2); 
//     }
// }

// recursive code got TLE error for testcase25
// word1 = "dinitrophenylhydrazine"               word2 = "benzalphenylhydrazone"
// class Solution {
//     public int minDistance(String word1, String word2) {
//         int n=word1.length();    int m=word2.length();

//         return helper(n-1, m-1, word1, word2);
//     }

//     public int helper(int i, int j, String s1, String s2){
//         // base case
//         if(i<0)   return j+1;     // inserting all left over char in j
//         if(j<0)   return i+1;     //del operation

//         if(s1.charAt(i) == s2.charAt(j) )  return 0+helper(i-1,j-1,s1,s2);
//         int mini = Math.min(1+helper(i-1,j,s1,s2) , 1+helper(i,j-1,s1,s2));  //del & insert opertn
//         return Math.min(mini, 1+helper(i-1,j-1,s1,s2));   //replace oprtion
//     }
// }

// leetcode daily challenge - 26th Feb
// dp code   Runtime: 9 ms  Beats 66.16%    Memory: 44.6 MB   Beats 72.57%
class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();    int m=word2.length();
        int[][] dp = new int[n+1][m+1];

        for(int i=0;i<=n;i++) dp[i][0] = i;
        for(int j=0;j<=m;j++) dp[0][j] = j;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)) dp[i][j] = 0+dp[i-1][j-1];
                else{
                    int mini = Math.min(1+dp[i-1][j] , 1+dp[i][j-1]);
                    dp[i][j] = Math.min(mini, 1+dp[i-1][j-1]);
                }
            }
        }
        return dp[n][m];
        // return helper(n-1, m-1, word1, word2);
    }
}