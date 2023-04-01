
// Runtime: 0 ms  Beats: 100%

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l1 = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        // if matrix is empty then return empty list
        if(row == 0)   return l1;

        int l=0, r=col-1, t=0, b=row-1, d=0;

        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++)   l1.add(matrix[t][i]);
                d=1; t++;
            }else if(d==1){
                for(int i=t;i<=b;i++) l1.add(matrix[i][r]);
                d=2; r--;
            }else if(d==2){
                for(int i=r;i>=l;i--) l1.add(matrix[b][i]);
                d=3;  b--;
            }else if(d==3){
                for(int i=b;i>=t;i--)  l1.add(matrix[i][l]);
                d=0; l++;
            }
        }
        return l1; 
    }
}

//     l    r
//  t [1,2,3]
//    [4,5,6]
//  b [7,8,9]

// o/p  -> 1,2,3 ->row -> d=0
// 6,9  -> col  -> d=1
// 8,7  -> row  -> d=2
// 4    -> col  -> d=3