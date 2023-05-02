// leetcode daily challenge - 2nd May

// Runtime:  0 ms      Beats: 100%
class Solution {
    public int arraySign(int[] nums) {
        int prod=1;

        for(int i : nums){
            if(i>0)         prod = prod*1;
            else if(i<0)    prod = prod*(-1);
            else     prod = 0;
        }
        return sign(prod);
    }
    public int sign(int n){
        if(n>0)  return 1;
        if(n<0)  return -1;
        return 0;
    }
}



// brute force approach -> large testcases giving wrong ans
// class Solution {
//     public int arraySign(int[] nums) {
//         long prod=1;

//         for(int i : nums){
//             prod = prod*i;
//             System.out.println(i+" "+prod);
//         }  
//         System.out.println(prod);

//         if(prod > 0) return 1;
//         if(prod < 0) return -1;

//         return 0;
//     }
// }

// [41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41]
// [9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24]