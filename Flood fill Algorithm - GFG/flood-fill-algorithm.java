//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // base case
        if(newColor == image[sr][sc])  return image;
        
        int n = image.length;     int m = image[0].length;       int[][] arr = image;
        boolean[][] vis = new boolean[n][m];
        int x= image[sr][sc];
        
        // bfs
        Queue<Pair> q1 = new ArrayDeque<>();
        vis[sr][sc] = true;    q1.add(new Pair(sr,sc));     arr[sr][sc]=newColor;
        
        while(!q1.isEmpty()){
            Pair p1 = q1.poll();
            int i = p1.f;    int j=p1.s;
            
            int[] r = {-1,0,1,0};
            int[] c = {0,1,0,-1};
            for(int k=0;k<4;k++){
                int row = i+r[k];    int col=j+c[k];
                if(row>=0 && row<n && col>=0 && col<m && vis[row][col]==false && image[row][col]==x){
                    arr[row][col]=newColor;    vis[row][col]=true;
                    q1.add(new Pair(row,col));
                }
            }

        }
        return arr;
    }
}

class Pair{
    int f; int s;
    public Pair(int f, int s){
        this.f = f;
        this.s = s;
    }
}