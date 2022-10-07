// Runtime: 0 ms, faster than 100.00%    Memory Usage: 42.1 MB, less than 80.71%
class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        if(len == 1)  return;
        
// transpose of a matrix
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(i != j){
                    int t=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=t;
                }
            }
        }
//   reversing each row 
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int t = matrix[i][j];
                matrix[i][j]=matrix[i][len-j-1];
                matrix[i][len-j-1]=t;
            }
        }
        
    }
}