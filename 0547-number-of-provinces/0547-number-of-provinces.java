// Runtime 2 ms       Beats 69.83%

// leetcode daily challenge - 4th June
class Solution {
    public int findCircleNum(int[][] isConnected) {
        // converting adjacency matrix to adjacency list
        int s = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=s;i++)  adj.add(new ArrayList<>());

        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(isConnected[i][j] == 1) adj.get(i+1).add(j+1);
            }
        }
        // System.out.println(adj);

        boolean[] vis = new boolean[s+1];
        int c=0;

        for(int i=1;i<=s;i++){
            if(vis[i] == false){
                c++;    dfs(i,vis, adj);
            }
        }
        return c;
    }

    public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        for(int i : adj.get(node)){
            // System.out.println(i);
            if(vis[i] == false)  dfs(i, vis, adj);
        }
    }
}