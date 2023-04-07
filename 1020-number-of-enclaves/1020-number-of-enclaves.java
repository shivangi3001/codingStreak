// leetcode daily challenge - 7th April

// array, dfs, bfs, matrix
// Runtime: 8 ms      Beats: 92.78%
class Solution {
    public int numEnclaves(int[][] grid) {
        if(grid==null || grid.length==0) return 0;

        int ans=0;     int r=grid.length;    int c=grid[0].length;
    // using dfs to convert all the boundary and boundary connect 1's to 0
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==0 || i==r-1 || j==0 || j==c-1) && grid[i][j] == 1){
                    dfs(i,j,r,c,grid);
                }
            }
        }

        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++)  System.out.print(grid[i][j]+" ");
        //     System.out.println();
        // }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)   ans += grid[i][j];
        }
        return ans;
    }

    public void dfs(int i, int j, int r, int c, int[][] grid){
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j] ==0) return;

        grid[i][j] = 0;
        dfs(i-1,j,r,c,grid);
        dfs(i+1,j,r,c,grid);
        dfs(i,j-1,r,c,grid);
        dfs(i,j+1,r,c,grid);

    }
}


//  0 0 0 1 0
//  0 1 1 0 0
//  0 1 0 1 1
//  0 0 1 1 0
//  0 1 1 0 0