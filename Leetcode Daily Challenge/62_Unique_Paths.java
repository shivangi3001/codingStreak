class Solution {
    public int uniquePaths(int m, int n) {
        
//         dp based approach all testcases passed with runtime of 0ms
        int[][] dp = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0)  dp[i][j]=1;
                else  dp[i][j]=dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        
}
        
        
// //public testcases passed getting tle error through recursion based method

//         ArrayList<String> list = uniquePaths(0,0,m-1,n-1);
//         //System.out.println(list);
//         return list.size();
//     }
    
//     public static ArrayList<String> uniquePaths(int sr, int sc, int dr, int dc){
//         if(sc==dc  && sr == dr){
//             ArrayList<String> list = new ArrayList<>();
//             list.add("");       return list;
//         }
        
        
//         ArrayList<String> hpath = new ArrayList<>();
//         ArrayList<String> vpath = new ArrayList<>();
        
//         if(sc < dc)  hpath = uniquePaths(sr, sc+1, dr, dc);
//         if(sr < dr)  vpath = uniquePaths(sr+1, sc, dr, dc);
        
//         ArrayList<String> paths = new ArrayList<>();
//         for(String i : hpath)  paths.add("h"+i);
//         for(String i : vpath)  paths.add("v"+i);
        
//         return paths;
//     }

}