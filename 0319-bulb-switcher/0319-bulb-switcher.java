// leetcode daily challenge - 27th April

// now trying the perfect square approach -> bcoz only perfect square
// numbers have odd factors
class Solution {
    public int bulbSwitch(int n) {
        if(n < 1)  return n;
        
        int c=0;
        for(int i=1; i*i<=n;i++){
            if(i*i <= n) c++;
        }
        return c;
    }
}

// n = 99999

// trying factors approach - from 1 to n -> count of numbers have odd number of factors
// 27 / 35 testcases passed  --> getting TLE error
// class Solution {
//     public int bulbSwitch(int n) {
//         if(n < 1)  return n;
        
//         int c=0;
//         for(int i=1;i<=n;i++){
//             int fact = factor(i);
//             System.out.println(i+" "+fact);
//             if(fact%2 != 0) c++;
//         }
//         return c;
//     }

//     public int factor(int num){
//         int sum = 0;
//         for(int i=1;i<=num/2;i++){
//             if(num%i == 0)  sum++;
//         }
//         return sum+1;
//     }
// }