// Testcases

// Example 1:
// Input: nums = [1,5,0,3,5]
// Output: 3
// Explanation:
// In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
// In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
// In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].

// Example 2:
// Input: nums = [0]
// Output: 0
// Explanation: Each element in nums is already 0 so no operations are needed.

// Constraints:
// 1 <= nums.length <= 100
// 0 <= nums[i] <= 100


// optimized approach/ logic
// according to the correlation and pattern in the input....it could be observed that
// output will always be equal to the "number of positive unique elements in the array"

// using hashMap to get all the positive unique elements then return size of hashmap


class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i : nums){
            if(i!= 0){
                hm1.put(i,1);
            }
        }
        //System.out.println(hm1);
        
        return hm1.size();
//         int len = nums.length;
//         if(len == 1){
//             if(nums[0] == 0)  return 0;
//             else return 1;
//         }
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i : nums)  list.add(i);
        
//         System.out.println(list);
//         Collections.sort(list);     System.out.println("after sort->"+list);
        
//         int count=0;
        
//         int j=0;
//         while(j<list.size()){
//         for(int i=0;i<list.size();i++){
//             System.out.println(list+"->"+count);
//             if(list.get(j) == 0) list.remove(i);
//             else{
                
//                 int x = list.get(j);   
//                 list.set(i,list.get(i)-x);
                
//             }
//             count++;
//         }
//         j++;
//     }
//     return count;


    }
}