// testcase--[2,3,-2,4]
// [-2,0,-1]
// [6,-3,10,0,2]
// [-2,3,-4]

// class Solution {
//     public int maxProduct(int[] nums) {
//         int len = nums.length;
//         if(len==1) return nums[0];
        
//         int ans = nums[0];
//         int ma=ans, mi=ans;
        
//         for(int i=1;i<len;i++){
//             if(i==0){ ma=1; mi=1;   }
//             if(i<0){
//                 int t=ma;   ma=mi;  mi=t;
//             }
//             ma = Math.max(nums[i], nums[i]*ma);
//             mi = Math.min(nums[i], nums[i]*mi);
//             ans = Math.max(ans, Math.max(ma,mi));
//         }
//         return ans;
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if(len==1) return nums[0];
        
        int ans = Integer.MIN_VALUE;
        int ma=1, mi=1;
        for(int i : nums){
            if(i==0){ ma=1; mi=1;  }
            int temp = ma*i;
            ma= Math.max(i, Math.max(ma*i, mi*i));
            mi = Math.min(i,Math.min(temp, mi*i));
            ans = Math.max(ans,Math.max(ma,mi));
            // System.out.println(ma+" "+mi+" "+ans);
        }
        return ans;
    }
}