// leetcode daily challenge - 6th June

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        if(n==2)   return true;

        Arrays.sort(arr);
        int diff = arr[1]-arr[0];

        for(int i=2;i<n;i++){
            int d = arr[i] - arr[i-1];
            if(diff != d)  return false;
        }
        return true;
    }
}