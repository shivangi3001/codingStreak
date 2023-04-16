// striver DSA array-> medium

// topic-> array, hashTable, prefixSum
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;  int res=0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(0,1);
        for(int i : nums){
            sum += i;

            if(hm.containsKey(sum-k))   res += hm.get(sum-k);

            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         if(nums.length == 1){
//             if(nums[0]==k) return 1;
//             return 0;
//         }
//         return helper(0,0,nums,k);
//     }
    
//     public int helper(int idx, int sum, int[] arr, int t){
//         if(idx==arr.length){
//             if(sum==t) return 1;
//             else  return 0;
//         }
//         if(sum == t) return 1;
//         if(sum > t) return 0;
        
//         sum = sum +arr[idx];
//         int l = helper(idx+1, sum, arr, t);
//         sum = sum-arr[idx];
        
//         int r = helper(idx+1, sum, arr, t);
//         System.out.println(l+" "+r+" "+sum+" "+idx);
//         return l+r;
//     }
    
// //     public void helper(int idx, int sum, int[] arr, int t, List<List<Integer>> l1, List<Integer> l2 ){
// //         if(idx==arr.length){
// //             if(sum==t){
// //                 l1.add(new ArrayList<>(l2));
// // 	            // return;
// // 	        }
// // 	        return;
// //         }
        
// //         // int l=0;
// // 	   if(sum<=t){
// // 	       l2.add(arr[idx]);
// // 	       helper(idx+1, sum+arr[idx], arr,t,l1,l2);  //take element
// // 	       l2.remove(l2.size()-1);
// // 	   }
// // 	   helper(idx+1,sum,arr,t,l1,l2);    // not take element
// // 	   // return l+r;
// //     }
// }