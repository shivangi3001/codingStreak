// striver DSA sheet

// Runtime: 0 ms     Beats:  100%

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int l=0, r=n-1, t=0, b=n-1, d=0;
        int j=1;
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){  matrix[t][i]=j;  j++; }
                // for(int i=l;i<=r;i++) System.out.println(t+" "+i+" "+j+" "+matrix[t][i]);
                d=1;   t++;
            }else if(d==1){
                for(int i=t;i<=b;i++){ matrix[i][r]=j;   j++;   }
                d=2;  r--;
            }else if(d==2){
                for(int i=r;i>=l;i--){ matrix[b][i]=j;   j++;  }
                d=3; b--;
            }else if(d==3){
                for(int i=b;i>=t;i--){ matrix[i][l]=j;   j++;  }
                d=0; l++;
            }
        }
        return matrix;
    }
}