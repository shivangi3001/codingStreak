//problem description
/* 
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

//Input & output Example
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,3], target = 6
Output: [0,1]
*/ 

// myCode solution( for leetcode editor)
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int l = nums.size();
        vector<int>v1(2);
    
        for(int i=0;i<l-1;i++){
            int sum = nums[i];
            int RHS = target-sum;
            for(int j=i+1;j<l;j++){
                if(RHS == nums[j]){
                    v1[0]=j;
                    v1[1]=i;
                    break;
                }
            }
        }
     
            
        return v1;
    }
};

//code solution (for general editors like codeblocks)
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int l = nums.size();
        vector<int>v1(2);

        for(int i=0;i<l-1;i++){
            int sum = nums[i];
            int RHS = target-sum;
            for(int j=i+1;j<l;j++){
                if(RHS == nums[j]){
                    v1[0]=j;
                    v1[1]=i;
                    break;
                }
            }
        }


        return v1;
    }
};

int main()
{
    vector<int>v{2,7,11,15};
    int target = 9;
    Solution s1;
    vector<int> res = s1.twoSum(v, target);
    for(int i=0;i<res.size();i++){
        cout<<res[i]<<" ";
    }
}


//167. Two Sum II - Input array is sorted
class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
         vector<int>v1(2);
        int i=0;
        int j=numbers.size()-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                v1[0]=i+1;
                v1[1]=j+1; break;
            }
            else if(numbers[i] + numbers[j] > target)  j--;
            else i++;
        }
        return v1;
    }
};
