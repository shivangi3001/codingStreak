class Solution {
    public boolean isPerfectSquare(int num) {
        if(num <= 1 )  return true;

        int a = (int)Math.pow(num, 0.5);
        if(a*a == num) return true;
        return false;
    }
}