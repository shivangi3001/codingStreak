class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> l1 = new ArrayList<>();
        // l1 = [[1,1,2],[2,3,4]];
        List<Integer> l2 = new ArrayList<>();
         if(nums.length < 3 ) return l1;

        Arrays.sort(nums);
        int i=0;
        while(i < nums.length - 2) {
            if(nums[i] > 0)  break;
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)  l1.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j<k);
                if(sum >= 0) while(nums[k--] == nums[k] && j<k);
            }
            while(nums[i] == nums[++i] && i<nums.length-2);
        }
        // List<int[]> l3 = Arrays.asList(nums);
        // int i=1;
        // while(nums[i] <= 0 && i < nums.length ){
        //     int sum = nums[i-1]+nums[i];
        //     if(l3.contains(-1*sum)){
        //         l2.add(nums[i-1]);   l2.add(nums[i]);  l2.add(-1*sum);
        //         l1.add(new ArrayList<>(l2));
        //     }
        //     i++;
        // }

        return l1;
    }
}