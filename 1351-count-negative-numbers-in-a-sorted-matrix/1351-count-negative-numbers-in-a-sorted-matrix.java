// leetcode daily challenge - 8th June

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count=0;
        for(int j=n-1;j>=0;j--){
            for(int i=m-1;i>=0;i--){
                if(grid[i][j] < 0)  count++;
                else   continue;
            }
        }
        return count;
    }
}