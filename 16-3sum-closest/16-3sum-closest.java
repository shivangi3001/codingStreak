// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int len = nums.length;
        
//         int sum=0;    int min = 0,c=0;
//         for(int i=0;i<=len-3;i++){
//             sum=0;
//             for(int j=i;j<i+3;j++){
//                 sum += nums[j];
//             }
//             if(Math.abs)
//         }
        
//     }
// }


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
	    var closest = 0;

	for (int i = 0, n = nums.length, minDiff = Integer.MAX_VALUE; i < n - 2; i++)
		for (int j = i + 1, k = n - 1; j < k;) {
			var sum = nums[i] + nums[j] + nums[k];
			if (sum == target)
				return target;
			if (sum < target)
				j++;
			else
				k--;

			var diff = Math.abs(target - sum);
			if (diff < minDiff) {
				minDiff = diff;
				closest = sum;
			}
		}
	return closest;
    }
}