// leetcode daily challenge -> 11th feb

// https://leetcode.com/problems/shortest-path-with-alternating-colors/solutions/340258/java-bfs-solution-with-video-explanation/
class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        int[][] g = new int[n][n];
        buildGraph(g, n, red_edges, blue_edges);
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 1});
        q.offer(new int[]{0, -1});
        int len = 0;
        int[] res = new int[n];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        
        Set<String> visited = new HashSet<>();
        while (!q.isEmpty()) {
            int size = q.size();
            len++;
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                int node = cur[0];
                int color = cur[1];
                int oppoColor = -color;
                
                for (int j = 1; j < n; j++) {
                    if (g[node][j] == oppoColor ||
                       g[node][j] == 0) {
                        if (!visited.add(j + "" + oppoColor)) continue;
                        q.offer(new int[]{j, oppoColor});
                        res[j] = Math.min(res[j], len);
                    }
                }
            }
        }
        
        for (int i = 1; i < n; i++) {
            if (res[i] == Integer.MAX_VALUE) {
                res[i] = -1;
            }
        }
        
        return res;
    }
    
    private void buildGraph(int[][] g, int n, int[][] red_edges, int[][] blue_edges) {
        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i], -n);
        }
        
        for (int[] e : red_edges) {
            int from = e[0];
            int to = e[1];
            g[from][to] = 1;
        }
        
        for (int[] e : blue_edges) {
            int from = e[0];
            int to = e[1];
            if (g[from][to] == 1) {
                g[from][to] = 0;
            } else {
                g[from][to] = -1;
            }
        }
    }
}

// class Solution {
//     public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {

//         int[] ans = new int[n];
//         Arrays.fill(ans, -1);

//         List<Pair<Integer, Color>>[] graph = new List[n];
//         Queue<Pair<Integer, Color>>q = new ArrayDeque<>(Arrays.asList(new Pair<>(0, Color.kInit)));

//         for(int i=0;i<n;i++)     graph[i] = new ArrayList<>();
//         for(int[] edge : redEdges) {
//             int u = edge[0];       int v = edge[1];
//             graph[u].add(new Pair<>(v, Color.kRed));
//         }

//         for(int[] edge : blueEdges) {
//             int u = edge[0];       int v = edge[1];
//             graph[u].add(new Pair<>(v, Color.kBlue));
//         }

//         for(int i=0; !q.isEmpty(); ++i){
//             for(int j=q.size();j>0;--j){
//                 final int u = q.peek().getKey();
//                 Color prevColor = q.poll().getValue();

//                 ans[u] = ans[u] == -1 ? i : ans[u];
//                 for (int i = 0; i < graph[u].size(); ++i) {
//                 Pair<Integer, Color> node = graph[u].get(i);
//                 final int v = node.getKey();
//                 Color edgeColor = node.getValue();
//                 if (v == -1 || edgeColor == prevColor)
//                     continue;
//                 q.add(new Pair<>(v, edgeColor));
//                 // Mark (u, v) as used.
//                 graph[u].set(i, new Pair<>(-1, edgeColor));
//                 }
//             }
//         }
//         return ans;
        
//     }
// }