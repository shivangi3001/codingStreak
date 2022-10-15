// testcases--> [[2,1,3],[6,5,4],[7,8,9]]
// [[-19,57],[-40,-5]]
// [[2]]
// [[1,2],[3,4]]

// recursive approach
// class Solution {
//     public int minFallingPathSum(int[][] matrix) {
//         int n = matrix.length;
        
//         return helper(0,0, matrix);
//     }
    
//     public int helper(int i, int j, int[][] arr){
//         int n = arr.length;
        
//         if(i==n-1 && j>=0 && j<n) return arr[i][j];
//         if(i>n || j>n || j<0) return (int)Math.pow(10,6);
        
//         int left = arr[i][j] + helper(i+1,j-1,arr);
//         int bot = arr[i][j] + helper(i+1, j, arr);
//         int right = arr[i][j] + helper(i+1, j+1, arr);
        
//         return Math.min(left, Math.min(bot,right));
//     }
// }


// dp approach
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0)  dp[i][j] = matrix[i][j];
                
                else{
                    int left =matrix[i][j];
                    if(j>0 && i>0) left += dp[i-1][j-1];
                    else left += (int)Math.pow(10,8);

                    int bot = matrix[i][j];
                    if(i>0) bot += dp[i-1][j];
                    else bot += (int)Math.pow(10,8);

                    int right = matrix[i][j];
                    if(j+1<n && i>0) right+=dp[i-1][j+1];
                    else right += (int)Math.pow(10,8);

                    dp[i][j] = Math.min(left, Math.min(bot,right));
                }
            }
        }
        // for(int i=0;i<n; i++){
        //     for(int j=0;j<n;j++)  System.out.print(dp[i][j] + " ");
        //     System.out.println();
        // }
        
        int mini= dp[n-1][0];
        for(int i=1;i<n;i++){
            if(dp[n-1][i]<mini)  mini =dp[n-1][i];
        }
        return mini;
    }
}