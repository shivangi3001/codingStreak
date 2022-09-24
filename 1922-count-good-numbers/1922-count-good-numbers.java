class Solution {
    public int countGoodNumbers(long n) {
// brute force approach failed for large testcases like n=5
//         if(n==1)  return 5;
//         int p = (int)(n/2);
//         int ev = (int)(n-p);
//         long ans = (long)(Math.pow(4,p)) * (long)(Math.pow(5,ev));
//         System.out.println(ans);
//         return (int)(ans%1000000007);
        
// iterative approach 2
        int mod = 1000000007;
        long x=20;
        long result = n%2==0?1:5;
//         2^8 = 4^4 = 16^2
        for(long i=n/2;i>0;i=i/2){
            if(i%2 != 0)  result = result*x % mod;
            x=x*x%mod;
        }
        return (int)result;
    }
}