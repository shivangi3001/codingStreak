// leetcode daily challenge --> 6th Jan 2023
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);

        // for(int i : costs) System.out.print(i+" ");     System.out.println();

        int c=0;
        for(int i=0;i<n;i++){
            coins = coins-costs[i];
            if(coins < 0) break;
            c++;
        }
        return c;
    }
}

// testcase 57 failed --> wrong ans

// 86159173


// class Solution {
//     public int maxIceCream(int[] costs, int coins) {
//         int n=costs.length;
//         return helper(n-1,costs, coins);
//     }

//     public int helper(int idx, int[] arr, int coins){
//         if(coins == 0) return 1;
//         if(idx == 0  ){
//             if(coins >= arr[0]) return 1;
//             return 0;
//         }
//         // if(idx==0 ) return 0;
//         if(idx < 0)  return 0;

//         int not = 0 + helper(idx-1, arr, coins);
//         int take =0;
//         if(coins >= arr[idx]){
//             take = 1 + helper(idx-1, arr, coins-arr[idx]);
//         }
//         return  Math.max(not, take);
//     }
// }