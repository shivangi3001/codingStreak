//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long ans = Integer.MIN_VALUE;
        long ma=1, mi=1;
        
        for(long i : arr){
            if(i==0){ mi=1; ma=1; }
            long temp = ma*i;
            ma = Math.max(i,Math.max(ma*i, mi*i));
            mi = Math.min(i,Math.min(temp, mi*i));
            ans = Math.max(ans,Math.max(ma,mi));
        }
        return ans;
    }
}

// testcase--
// 13
// 3 12 15 23 33 -35 30 -40 -30 -30 -30 26 28