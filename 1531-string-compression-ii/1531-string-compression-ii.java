// testcases -- "aaabcccd"   2
// "aabbaa"   2
// "aaaaaaaaaaa"  0
// "aabaabbcbbbaccc"  6
// "a"   1
// "aa"     2
// "aa"     1

// brute force approach failed for this testcases -->"llllllllllttttttttt"   1
// class Solution {
//     public int getLengthOfOptimalCompression(String s, int k) {
        
//         int len = s.length();
//         int[] freq = new int[26];
//         boolean[] flag = new boolean[26];
//         for(char ch : s.toCharArray()) freq[ch-'a']++;
        
//         char ch1 = s.charAt(0);  int a = freq[ch1-'a'];
//         String str = ""+ch1;    flag[ch1-'a'] = true;
//         if(a>1) str +=a;
        
//         for(int i=1;i<len;i++){
//             if(s.charAt(i) != s.charAt(i-1) && !flag[s.charAt(i) -'a']){
//                 str += s.charAt(i);   flag[s.charAt(i) - 'a'] = true;
//                 int c = freq[s.charAt(i) - 'a'];
//                 if(c>1) str+=c;
//             }
//         }
//         System.out.println(str);
//         int len1 = str.length();
        
//         if(k==0) return len1;
//         for(char ch : s.toCharArray()){
//             if(freq[ch-'a'] == k && k>0){
//                 if(k==1)  len1 = len1-1;
//                 else len1=len1-2; 
//                 k=0;
//             }
//             else if(freq[ch-'a']<3 && k>0){
//                 len1--;  k--;
//             }
//             else if(freq[ch-'a']==10 && k>0)  { len1--;  k--;  }
//             else if(freq[ch-'a']==100 && k>0) { len1--;  k--;  } 
//         }
//         return len1;
//     }
// }

// "aaabcccd"
// 2
// "aabbaa"
// 2
// "aaaaaaaaaaa"
// 0
// "abaabba"
// 5
// "llllllllllttttttttt"   1
// "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll"
// 1

class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        // dp[i][k]: the minimum length for s[:i] with at most k deletion.
        int n = s.length();
        int[][] dp = new int[110][110];
        for (int i = 0; i <= n; i++) for (int j = 0; j <= n; j++) dp[i][j] = 9999;
		// for (int[] i : dp) Arrays.fill(i, n); // this is a bit slower (100ms)
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= k; j++) {                
                int cnt = 0, del = 0;
                for(int l = i; l >= 1; l--) { // keep s[i], concat the same, remove the different
                    if(s.charAt(l - 1) == s.charAt(i - 1)) cnt++;
                    else del++;
                    if(j - del >= 0) 
                        dp[i][j] = Math.min(dp[i][j], 
                                            dp[l-1][j-del] + 1 + (cnt >= 100 ? 3 : cnt >= 10 ? 2 : cnt >= 2 ? 1: 0));
                }
                if (j > 0) // delete s[i]
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]);
            }
        }
        return dp[n][k];
    }
}