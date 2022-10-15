// recursive code ---> got TLE error
// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int len = triangle.size();
        
//         int start = triangle.get(0).get(0);
//         int[] mini = new int[1];
//         mini[0] = Integer.MAX_VALUE;
//         helper(0,0,start,mini,triangle);
            
//         return mini[0];
//     }
//     public void helper(int i, int j, int sum, int[] mini, List<List<Integer>>arr){
//         int len = arr.size();
//         int lastRow = arr.get(len-1).size();
        
//         if(i == len-1){
//             mini[0] = Math.min(mini[0],sum);
//             // System.out.println(mini[0]+" "+sum);
//             return;
//         }
//         if(i>=len || j>=lastRow) return;
        
//         helper(i+1,j,sum+arr.get(i+1).get(j), mini, arr);
//         helper(i+1, j+1, sum+arr.get(i+1).get(j+1), mini, arr);
//     }
// }

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();  int lastCol = triangle.get(len-1).size();
        int[][] dp = new int[len][lastCol];
        
        for(int j=0;j<lastCol;j++)  dp[len-1][j] = triangle.get(len-1).get(j);
        
        for(int i=len-2;i>=0;i--){
            for(int j=i ; j>=0;j--){
                int bot = triangle.get(i).get(j) + dp[i+1][j];
                int diag = triangle.get(i).get(j) + dp[i+1][j+1];
                
                dp[i][j] = Math.min(bot,diag);
            }
        }
        return dp[0][0];
        
        // for(int i=0;i<len;i++){
        //     for(int j=0;j<i+1;j++){
        //         if(i==0 && j==0)  dp[i][j]=triangle.get(i).get(j);
        //         else{
        //             int bot = triangle.get(i).get(j);
        //             int diag = triangle.get(i).get(j);
        //             if(i>0){
        //                 bot += dp[i-1][j];
        //                 if(j>0)  diag += dp[i-1][j-1];
        //                 else diag += Math.pow(10,9);
        //             }
        //             dp[i][j] = Math.min(bot,diag);
        //         }
        //     }
        // }
        // return dp[len-1][lastCol-1];
    }
}