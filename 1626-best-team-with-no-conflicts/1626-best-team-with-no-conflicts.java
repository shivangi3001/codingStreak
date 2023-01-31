// daily leetcode challenge --> 31st Jan 2023
// prerequiste -> longest increasing subsequences

// Runtime 43 ms     Beats 79.59%
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int len = scores.length;

        int[][] arr = new int[len][2];
        for(int i=0;i<len;i++){
            arr[i][0] = ages[i];        arr[i][1] = scores[i];
        }
        
        // for(int i=0;i<len;i++)  System.out.println(arr[i][0]+" "+arr[i][1]);     System.out.println();
        Arrays.sort(arr, (a,b) -> a[0]==b[0]? a[1]-b[1] : a[0]-b[0]);
        // for(int i=0;i<len;i++)  System.out.println(arr[i][0]+" "+arr[i][1]);     System.out.println();

        int[] dp = new int[len];
        dp[0] = arr[0][1];
        int max = dp[0];
        for(int i=1;i<len;i++){
            dp[i] = arr[i][1];
            for(int j=0;j<i;j++){
                if(arr[j][1] <= arr[i][1])  dp[i] = Math.max(dp[i], arr[i][1]+dp[j]);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
        // return -1;
    }
}

// scores -> [319776,611683,835240,602298,430007,574,142444,858606,734364,896074]
// ages -> [1,1,1,1,1,1,1,1,1,1]