// testcases -- [[0,0,0],[0,1,0],[0,0,0]]     o/p--> 2
// [[0,1],[0,0]]                                     1
// [[0,0],[0,1]]                                     0
// [[0]]
// [[1]]
// [[1,0],[0,0]]
// [[0,0],[1,1],[0,0]]

// recursive approach---- got tle error for large input
// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int r = obstacleGrid.length;
//         int c = obstacleGrid[0].length;
        
//         if(r==1 && c==1){
//             if(obstacleGrid[0][0] != 1 )return 1;
//             return 0;
//         }
//         if(obstacleGrid[r-1][c-1] == 1) return 0;
        
//         return helper(r-1, c-1, obstacleGrid);
//     }
    
//     public int helper(int r, int c, int[][] arr){
//         if(r==0 && c==0) return 1;
//         if(r<0 || c<0)  return 0;
        
//         int up=0, left=0;
//         if(r>0 && arr[r-1][c] != 1)  up = helper(r-1,c,arr);
//         if(c>0 && arr[r][c-1] != 1)  left = helper(r,c-1,arr);
        
//         return up +left;
//     }
// }

// my dp approach failed for this testcase -- [[0,0],[1,1],[0,0]]
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1)  return 0;
        
        int[][] dp = new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(obstacleGrid[i][j] == 1) dp[i][j]=0;
                // else{
                //     if(i==0 || j== 0)   dp[i][j]=1;
                //     else  dp[i][j] = dp[i-1][j] +dp[i][j-1];
                // }
                else if(i==0 && j==0) dp[i][j]=1;
                else{
                    int left=0, up=0;
                    if(i>0) left = dp[i-1][j];
                    if(j>0) up = dp[i][j-1];
                    dp[i][j] =up+left;
                }
            }
        }
        return dp[r-1][c-1];
    }
}