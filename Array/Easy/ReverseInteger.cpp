//problem description
/* 
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the 
signed 32-bit integer range [-231, 231 - 1], then return 0.
*/

//Input & output Example
/*
Example 1:
Input: x = -123
Output: -321

Example 2:
Input: x = 120
Output: 21

Example 3:
Input: x = 0
Output: 0
*/ 


//code
class Solution {
public:
    int reverse(int x) {
        if(x==0 ) return 0;
        if(x<0){
            long y=x;
            y = y*(-1);
            int rem; 
            long rev=0;
            while(y>0){
                rem=y%10;
                y=y/10;
                rev=rev*10 +rem;
            }
            if(rev<pow(2,-31) || rev>pow(2,31)) return 0;
            else return rev*(-1);
        }
        else{
            int rem;
            long rev=0;
            while(x>0){
                rem=x%10;
                x=x/10;
                rev=rev*10 +rem;
            }
            if(rev<pow(2,-31) || rev>pow(2,31)) return 0;
            else return rev;
        }
        
    }
};
