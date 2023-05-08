// leetcode daily challenge - 8th May - 2023 array Matrix

// Runtime: 10 ms   Beats: 30.60%

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;

        int sum = 0;

        int i=0,j=0;
        while(i<n && j<n){
            sum += mat[i++][j++];
        }
        System.out.println(i+" "+j+" "+sum);

        i=0;   j=n-1;
        while(i<n && j>=0)  sum += mat[i++][j--];
        System.out.println(i+" "+j+" "+sum);

        if(n%2 != 0){
            int x = n/2;
            sum = sum - mat[x][x];
        }

        return sum;
    }
}