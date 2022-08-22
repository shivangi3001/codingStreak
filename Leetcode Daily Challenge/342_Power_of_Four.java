class Solution {
    public boolean isPowerOfFour(int n) {
//   as power of any number is always positive
        if(n<=0) return false;
        
//     because 4^0 = 1
        if(n==1)  return true;
        
//    condition to eliminate numbers that are multiple of 4 but not power of 4 
        if(n%4 != 0)   return false;
        
//   final recursive solution
        return isPowerOfFour(n/4);
        
    }
}