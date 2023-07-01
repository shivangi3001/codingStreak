// leetcode daily challenge - 1st July

class Solution {
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0, k, new int[k]);
        return ans;
    }

    void helper(int[] cookie, int s, int k, int[] bag){
        if(s == cookie.length){
            int max=0;
            for(int c : bag){
                max = Math.max(max, c);
            }
            ans = Math.min(ans, max);
            return;
        }

        for(int i=0;i<k;i++){
            bag[i] += cookie[s];
            helper(cookie, s+1, k, bag);
            bag[i] -= cookie[s];
        }
    }
}