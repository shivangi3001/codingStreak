// Runtime 1 ms    Beats 100%


class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;

        int a = (int)Math.pow(x, 0.5);
        return a;
    }
}