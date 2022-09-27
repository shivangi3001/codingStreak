class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Collections.sort(Arrays.asList(nums));
        Arrays.sort(nums);
        int l = nums.length;
        return nums[l-k];
    }
}