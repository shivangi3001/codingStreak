class Solution {
    public int[] findBall(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        int[] ans = new int[c];
        for(int j=0;j<c;j++){
            int pos=j;
            int npos;
            for(int i=0;i<r;i++){
                npos = pos + grid[i][pos];
                
                if(npos<0 || npos>=c || grid[i][pos] != grid[i][npos]){  pos=-1;   break; }
                pos=npos;
            }
            ans[j] = pos;
        }
        return ans;
    }
}

// testcases --   [[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]
// [[-1]]
// [[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1],[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1]]
// [[1,-1,-1,1,-1,1,1,1,1,1,-1,1,1,1,1,1,1,-1,-1,-1,-1,-1,-1,1,-1,1,-1,1,-1,-1,-1,-1,1,-1,1,1,-1,-1,-1,-1,-1,1],[-1,1,1,1,-1,-1,-1,-1,1,1,1,-1,-1,-1,1,-1,-1,1,1,1,1,1,1,-1,1,-1,-1,-1,-1,-1,1,-1,1,-1,-1,-1,-1,1,1,-1,1,1],[1,-1,-1,-1,-1,1,-1,1,1,1,1,1,1,1,-1,1,-1,-1,-1,1,-1,-1,1,-1,1,-1,1,-1,-1,1,-1,1,-1,1,1,-1,-1,1,1,-1,1,-1]]