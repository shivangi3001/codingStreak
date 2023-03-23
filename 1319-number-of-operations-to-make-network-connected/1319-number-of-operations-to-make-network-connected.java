// leetcode daily challenge - 23rd March 2023

// using graph dfs approach
class Solution {
    public int makeConnected(int n, int[][] connections) {
        // base condition when no. of wires is less than no. of nodes -1 then --> not possible
        if(connections.length < n-1)   return -1;
        List<List<Integer>> l1 = new ArrayList<>();

        for(int i=0;i<n;i++)  l1.add(new ArrayList<>());

        for(int i=0;i<connections.length;i++){
            int u = connections[i][0];
            int v = connections[i][1];

            l1.get(u).add(v);    l1.get(v).add(u);
        }
        // System.out.println(l1);

        boolean[] vis = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            // System.out.println("C "+c+" i "+i);
            c = c+ dfs(i,l1,vis);
        }
        return c-1;
    }

    public int dfs(int i, List<List<Integer>>l1, boolean[] vis){
        if(vis[i])  return 0;

        vis[i]=true;
        for(Integer j : l1.get(i)){
            dfs(j, l1, vis);
        }
        // System.out.println("i "+i);
        return 1;
    }
}