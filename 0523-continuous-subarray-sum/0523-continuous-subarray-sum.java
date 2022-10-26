// recursive code...got TLE error
// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         return helper(0,k,0,0,nums);
//     }
    
//     public boolean helper(int idx, int k, int count, int sum, int[] arr){
//         if(count>=2 && sum%k == 0)   return true;
        
//         if(idx == arr.length){
//             if(count>=2 && sum%k==0) return true;
//             return false;
//         }
        
//         boolean pick = helper(idx+1,k,count+1,sum+arr[idx],arr);
//         boolean notPick = helper(idx+1,k,0,0,arr);
//         return pick || notPick;
//     }
// }

// memoization code failed for long testcase
// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int[] dp = new int[nums.length];
//         Arrays.fill(dp, -1);
//         return helper(0,k,0,0,nums, dp);
//     }
    
//     public boolean helper(int idx, int k, int count, int sum, int[] arr, int[] dp){
//         if(count>=2 && sum%k == 0)   return true;
        
//         if(idx == arr.length){
//             if(count>=2 && sum%k==0) return true;
//             return false;
//         }
//         if(dp[idx] != -1)  return dp[idx]==0?false:true; 
        
//         boolean pick = helper(idx+1,k,count+1,sum+arr[idx],arr, dp);
//         boolean notPick = helper(idx+1,k,0,0,arr, dp);
//         dp[idx] = pick||notPick?1:0;
//         return pick || notPick;
//     }
// }

// testcases-- [23,2,4,6,7]    6
// [23,2,6,4,7]                   6
// [23,2,6,4,7]                   13
// [18,373,97,499,525,170,133,376,77,279,257,168,319,335,237,36,236,41,360,131,172,279,405,236,296,377,348,411,135,411,273,230,103,274,211,427,101,243,31,485,282,40,28,81,6,318,502,521,140,110,467,248,404,107,108,129,113,113,333,83,242,194,112,446,463,102,145,107,73,47,53,455,301,150,314,13,180,119,234,509,199,503,69,224,228,427,309,497,342,329,518,35,425,343,417,509,85,234,426,334]       250

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {      
        // maintain a hash map to store <sum % k, index>
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k; 
            // case 1
            if (sum == 0 && i > 0) {
                return true;
            }
            // case 2
            if (map.containsKey(sum) && i - map.get(sum) > 1) { 
                return true;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i); 
            }
            
        }
        return false;
    }
}
// Time complexity = O(n) for traversing n elements in input array
// Space complexity = O(n) for hash map storage