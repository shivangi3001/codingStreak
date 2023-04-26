// leetcode daily challenge - 26th April 2023


// optimal approach -> if the sum of diggest sum upto 9-> then ans is 9 else
// ans =  num%9
class Solution {
    public int addDigits(int num) {
        if(num == 0)  return 0;
        else if(num%9 == 0)  return 9;
        else return num%9;
    }
    
}

// class Solution {
//     public int addDigits(int num) {
//         int len = (int)(Math.log10(num)+1);

//         if(len == 1)  return num;

//         boolean flag = true;
//         while(flag){
//             int a = (int)(Math.log10(num)+1);
//             if(a == 1)  flag=false;
//             num = digAdd(num);
//         }
//         return num;
//     }
    
// }