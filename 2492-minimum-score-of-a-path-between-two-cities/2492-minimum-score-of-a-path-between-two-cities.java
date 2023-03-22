
// leetcode daily challenge - 22nd March 2023

class Pair{
    int node;
    int dist;
    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n+1;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
        }
        // System.out.println(adj);

        // bfs
        Queue<Pair> qu=new LinkedList<>();
        boolean vis[]=new boolean[n+1];
        qu.add(new Pair(1,Integer.MAX_VALUE));
        int ans=Integer.MAX_VALUE;
        while(!qu.isEmpty()){
            Pair p=qu.poll();
            vis[p.node]=true;
            ans=Math.min(ans,p.dist);
            for(Pair adjcomp:adj.get(p.node)){
                if(!vis[adjcomp.node]){
                    qu.add(adjcomp);
                }
            }
        }
        return ans;
    }
}


// class Solution {
//     public int minScore(int n, int[][] roads) {
        
//         List<List<Pair<Integer, Integer>>> l1 = new ArrayList<>();

//         for(int i=0;i<=n;i++)   l1.add(new ArrayList<Pair<Integer, Integer>>());

//         for(int i=0;i<roads.length;i++){
//             int a = roads[i][0];
//             int b = roads[i][1];
//             int c = roads[i][2];

//             l1.get(a).add(new Pair<>(b,c));
//             l1.get(a).add(new Pair<>(b,c));
//         }

//         // BFS code
//         // int[] vis = new int[n+1];
//         // Arrays.fill(vis, 0);
//         // Queue<Integer> q = new LinkedList<>();
//         // q.add(1);
//         // vis[1] = 1;
//         // while(!q.isEmpty()){
//         //     int node = q.pol();

//         // }
//         Queue<Pair<Integer, Integer>> q1 = new ArrayDeque<>();
//         boolean[] cis = new boolean[n+1];

//         q1.add(new Pair<>(1, Integer.MAX_VALUE));
//         int ans = Integer.MAX_VALUE;

//         while(!q1.isEmpty()){
//             Pair p1 = q1.pop();

//         }
//     }
// }