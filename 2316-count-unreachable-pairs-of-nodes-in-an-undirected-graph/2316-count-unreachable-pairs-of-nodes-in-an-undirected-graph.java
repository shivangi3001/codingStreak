// leetcode daily challenge - 25th march

class Solution {
    public long countPairs(int n, int[][] edges) {
        
        List<List<Integer>> l1 = new ArrayList<>();
        for(int i=0;i<n;i++)   l1.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            l1.get(u).add(v);     l1.get(v).add(u);
        }
        System.out.println(l1);

        boolean[] vis = new boolean[n];
        int numVisited=0;
        long numUnreachable=0;
        for(int i=0;i<n;i++){
            if(vis[i] == false){
                int numNodesCurrent = dfs(i, vis, l1);
                numUnreachable += (long) numNodesCurrent * numVisited;
                numVisited += numNodesCurrent;
            }
        }
        return numUnreachable;
    }
    private int dfs(int i, boolean[] vis, List<List<Integer>> l1){
        vis[i] = true;
        int numConnected = 1;
        for(int j : l1.get(i)){
            if(vis[j] == false)   numConnected += dfs(j, vis, l1);
        }
        return numConnected;
    }
}