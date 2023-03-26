// leetcode daily challenge -> 26th march

// Runtime: 110 ms   Beats: 34.36%


// using graph, dfs, hashmap --> got TLE for this code --> 63 / 76 testcases passed
class Solution {
    // int ans=-1;
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean[] vis = new boolean[n];

        int[] ans = new int[1];   ans[0]=-1;

        for(int i=0;i<n;i++){
            if(vis[i] == false){
                HashMap<Integer, Integer> hm = new HashMap<>();
                hm.put(i,1);
                dfs(i, edges, vis, hm, ans);
            }
        }
        // return ans;
        return ans[0];
    }

    public void dfs(int i, int[] edges, boolean[] vis, HashMap<Integer, Integer> hm, int[] ans){
        vis[i]=true;
        int neighbour = edges[i];
        if(neighbour != -1){
            if(vis[neighbour]==false ){
                hm.put(neighbour, hm.get(i)+1);
                dfs(neighbour, edges, vis, hm, ans);
                // dfs(neighbour, edges, vis, hm);
            }
            else if(hm.containsKey(neighbour)) {
                ans[0] = Math.max(ans[0], hm.get(i)-hm.get(neighbour)+1);
                // ans = Math.max(ans, hm.get(i)-hm.get(neighbour)+1);
            } 
        }
    }
}


// class Solution {
//     public int longestCycle(int[] edges) {
//         int n = edges.length;

//         List<List<Integer>> l1 = new ArrayList<>();
//         for(int i=0;i<n;i++) l1.add(new ArrayList<>());

//         // for(int i=0;i<n;i++) l1.get(i).add(edges[i]);
//         // System.out.println(l1);

//         // reversing the graph to avoid TLE
//         for(int i=0;i<n;i++) l1.get(edges[i]).add(i);
//         System.out.println(l1);
        
//         // dfs
//         boolean[] vis = new boolean[n];
//         HashMap<Integer, Integer> hm = new HashMap<>();

//         for(int i=0;i<n;i++){

//         }

//         // int c=-1;
//         // HashMap<Integer, Integer> hm = new HashMap<>();
//         // for(int i=0;i<n;i++){
//         //     if(!hm.containsKey(i))  dfs(i, l1, hm);
//         //     else c=
//         // }
        
//         return 0;
//     }
//     public int dfs(int i, List<List<Integer, Integer>>l1, HashMap<Integer, Integer)
// }