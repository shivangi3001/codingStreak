// testcases
// I/p: 123                  o/p:  321
// -123                            -321
// 120                              21
// 1534236469                       0


class Solution {
    public int reverse(int x) {
        long n=x;
        // long y =x;
        if(x<0){
            x=(-1)*x;
        }
        long rev=0;
        while(x>0){
            long rem = x%10;
            x=x/10;
            rev = rev*10+rem;
        }
        if(rev>= Integer.MIN_VALUE && rev<=Integer.MAX_VALUE){
        if(n>0)  return (int)rev;
        else     return (int)((-1)*rev);
        }
        return 0;
    }
}