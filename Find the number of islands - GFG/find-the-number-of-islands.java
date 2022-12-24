//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int len = grid.length;     int m = grid[0].length;
        
        boolean[][] vis = new boolean[len][m];
        
        int c=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == false && grid[i][j]=='1' ){
                    bfs(i,j,grid,vis);    c++;
                }
            }
        }
        return c;
    }
    
    public void bfs(int i, int j, char[][] grid, boolean[][] vis){
        int n = grid.length;    int m=grid[0].length;
        
        Queue<Pair> q1 = new ArrayDeque<>();
        vis[i][j]=true;   q1.add(new Pair(i,j));
        
        while(!q1.isEmpty()){
            Pair p1 = q1.poll();
            int x= p1.f;    int y=p1.s;
            
            for(int r=-1;r<=1;r++){
                for(int c=-1;c<=1;c++){
                    int row = x+r;   int col=y+c;
                    if(row>=0 && row<n && col>=0 && col<m && grid[row][col]=='1' && vis[row][col]==false){
                        vis[row][col]=true;   q1.add(new Pair(row,col));
                    }
                }
            }
        }
    }
}

class Pair{
    int f;  int s;
    
    public Pair(int f, int s){
        this.f =f;     this.s =s;
    }
}