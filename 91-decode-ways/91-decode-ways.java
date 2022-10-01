class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0]=1;
        dp[1]= s.charAt(0)=='0'? 0:1;
        for(int i=2;i<=len;i++){
            int singDig = Integer.valueOf(s.substring(i-1,i));
            int doubDig = Integer.valueOf(s.substring(i-2,i));
            if(singDig>=1) dp[i] += dp[i-1];
            if(doubDig >=10  &&  doubDig<=26)  dp[i] += dp[i-2];
        }
        return dp[len];
    }
}