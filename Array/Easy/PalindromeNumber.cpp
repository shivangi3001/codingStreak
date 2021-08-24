
/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
*/

/* Input-Output
Example 1:
Input: x = 121
Output: true

Example 2:
Input: x = -121
Output: false


Example 3:
Input: x = 10
Output: false
*/

//code
class Solution {
public:
    bool isPalindrome(int x) {
        bool c;
        if(x==0)  c=true; 
        if(x<pow(2,-31) && x<0) c=false; 
        if(x>0 && x<pow(2,31)){
            int rem;
            long rev=0, x1=x;
            while(x>0){
                rem=x%10;
                x=x/10;
                rev=rev*10 + rem;
            }
           
            if(rev == x1) c=true;
            else  c=false;
        }
        return c;
    }
};
