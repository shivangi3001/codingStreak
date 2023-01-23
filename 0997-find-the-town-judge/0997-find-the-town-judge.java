// daily leetcode challenge --> 23rd jan2023

// Runtime  54 ms     Beats  6.68%
// array based approach
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length ==0){
            if(n==1) return 1;
            return -1;
        }
        // if(trust.length==0)   return 1;

        int[] arr1 = new int[n+1];
        int[] arr2 = new int[n+1];

        for(int i=0;i<trust.length;i++){
            int u = trust[i][0];         int v = trust[i][1];
            arr1[u]++;   arr2[v]++; 
        }

        for(int i=0;i<=n;i++) System.out.print(arr1[i]+" ");
        System.out.println();
        for(int i=0;i<=n;i++) System.out.print(arr2[i]+" ");

        for(int i=0;i<=n;i++){
            if(arr1[i]==0  && arr2[i]==n-1) return i; 
        }
        return -1;
    }
}

// // testcase failed --->
// // n = 4
// // [[1,3],[1,4],[2,3],[2,4],[4,3]]
// n=1
// []
// n=2
// []

// graph approach
// class Solution {
//     public int findJudge(int n, int[][] trust) {

//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//         for(int i=0;i<=n;i++)   adj.add(new ArrayList<>());

//         for(int i=0;i<trust.length;i++){
//             int u = trust[i][0];         int v=trust[i][1];
//             adj.get(v).add(u);
//         }
//         System.out.println(adj);

//         int overMax=0;    int c=0;
//         for(int i=0;i<adj.size();i++){
//             if(adj.get(i).size() > overMax ){
//                 overMax = adj.get(i).size();   c=i;
//             }
//         }
//         return c;
//     }
// }



// class Solution {
//     public int findJudge(int n, int[][] trust) {
        
//         int len = trust.length;
//         if(len==0)  return 1;

//         for(int i=len-1;i>0;i--){
//             if(trust[i][1] != trust[i-1][1]) return -1;
//         }
//         return trust[0][1];
//     }
// }

