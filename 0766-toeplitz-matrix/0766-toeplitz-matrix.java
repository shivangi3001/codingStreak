class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i=r-1;i>0;i--){
            for(int j=c-1;j>0;j--){
                if(matrix[i][j] != matrix[i-1][j-1])  return false;
            }
        }
        return true;
    }
}