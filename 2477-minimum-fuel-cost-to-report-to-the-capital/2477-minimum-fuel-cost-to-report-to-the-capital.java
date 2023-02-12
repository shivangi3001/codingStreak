// leetcode daily challenge -> 12th Feb 2023

// https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/solutions/2831676/c-java-python3-simple-dfs-o-n/
class Solution {
    public long minimumFuelCost(int[][] roads, int seats) {
        

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=roads.length;i++) adj.add(new ArrayList<>());

        for(int i=0;i<roads.length;i++){
            int a=roads[i][0];    int b=roads[i][1];
            adj.get(a).add(b);   adj.get(b).add(a);
        }
        System.out.println(adj);

        long[] fuel = new long[1];
        dfs(adj,0,-1,fuel,seats);
        return fuel[0];
    }

    public int dfs(List<List<Integer>>adj, int curr, int prev, long[] fuel, int seat){
        int people = 1;
        for(int i : adj.get(curr)){
            if(i == prev)  continue;
            people += dfs(adj, i, curr, fuel,seat);
        }
        if(curr != 0){
            fuel[0] += (people + seat - 1)/seat;
        }
        return people;
    }

}