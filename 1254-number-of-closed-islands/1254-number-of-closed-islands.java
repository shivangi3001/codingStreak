// leetcode daily challenge - 6th april   Runtime: 1 ms    Beats: 100%

// used dfs approach to traverse in 4 directions
// T.C -> O(m*n)    S.C -> O(m*n)
class Solution {
    public int closedIsland(int[][] grid) {
        if(grid==null || grid.length == 0)  return 0;
        int closed=0, r=grid.length, c=grid[0].length;
        for(int i=1;i<r-1;i++){
            for(int j=1;j<c-1;j++){
                if(grid[i][j] == 0){
                    if(isClosed(i,j,r,c,grid))  closed++;
                }
            }
        }
        return closed;
    }
    private boolean isClosed(int i, int j, int r, int c, int[][]grid){
        // -1 -> visited
        // 1 -> water
        // 0 -> land
        if(grid[i][j] ==-1 || grid[i][j]==1)   return true;
        // this means grid value is 0
        if(i==0 || j==0 || i==r-1 || j==c-1)  return false;
        // line 23 means that grid value is 0 and it does not lie on the boundaries
        grid[i][j]=-1;
        // now traversing in all 4 directions left, right,top,bottom
        boolean left = isClosed(i,j-1,r,c,grid);
        boolean right = isClosed(i,j+1,r,c,grid);
        boolean top = isClosed(i-1,j,r,c,grid);
        boolean bottom = isClosed(i+1,j,r,c,grid);

        return left && right && top && bottom;
        
    }

}