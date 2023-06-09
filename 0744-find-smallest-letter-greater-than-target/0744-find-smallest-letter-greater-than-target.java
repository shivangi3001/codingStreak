// leetcode daily challenge - 9th June
// binary search

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0; int e = letters.length -1;
        //if(target >= letters[e])  return letters[0];
        while(s<=e){
            int mid = s +(e-s)/2;
            
            if(target < letters[mid]) e=mid-1;
            else s=mid+1;
        }
        return letters[s % letters.length];
    }
}

// brute force solution ....passed only 129 testcases out of 167
// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int n =letters.length;
//         if(letters[0] > target || letters[n-1] < target)   return letters[0];
//         // if(letters[n-1] < target)  
//         int s=0, e=letters.length-1;
//         while(s<=e){
//             int m = s+(e-s)/2;
//             System.out.println(s+" "+e+" "+m+" "+letters[m]);
//             if(letters[m] == target){
//                 if(m==letters.length-1)  return letters[0];
//                 else return letters[m+1];
//             } 
//             // return letters[m+1];
//             // else if(letters[m] < target)  s=m+1;
//             // else e=m-1;
//             if(letters[m] < target) s=m+1;
//             else if(letters[m] > target) e=m-1;
//             // return letters[s];
//         }
//         // if(s>e) return letters[0];
//         System.out.println("ans->"+letters[s]);
//         return letters[s];
//     }
// }

// ["c","f","j"]   "a"
// ["c","f","j"]   "c"
// ["x","x","y","y"]   "z"
// ["c","f","j"]    "d"
// ["c","f","j"]   "j"

