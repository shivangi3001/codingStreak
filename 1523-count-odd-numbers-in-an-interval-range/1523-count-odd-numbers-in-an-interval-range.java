// leetcode daily challenge -> 13th feb 2023

class Solution {
    public int countOdds(int low, int high) {
        int a = (high-low)/2;
        if(low%2 !=0 || high%2 !=0) return a+1;
        return a;
        
    }
}