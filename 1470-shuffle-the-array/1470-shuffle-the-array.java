// daily leetcode challenge -> 6th Feb

// Runtime: 2 ms     Beats: 14.92%
class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer>l1 = new ArrayList<>();

        int len = nums.length;

        for(int i=0;i<len-n;i++){
            l1.add(nums[i]);  l1.add(nums[i+n]);
        }
        // System.out.println(l1);

        int[] ans = new int[l1.size()];
        for(int i=0;i<len;i++)   ans[i] = l1.get(i);

        return ans;
    }
}