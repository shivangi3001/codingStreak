class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1 = new ArrayList<>();
        
        List<Integer> l2 = new ArrayList<>();
        int[][] dp = new int[numRows][numRows];
        
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) dp[i][j]=1;
                else dp[i][j] =dp[i-1][j]+dp[i-1][j-1];
                l2.add(dp[i][j]);
            }
            l1.add(l2);
            l2 = new ArrayList<>();
        }
        // System.out.println(l1);
        return l1;
    }
}