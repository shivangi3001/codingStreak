//  6120. Maximum Number of Pairs in Array
// link - https://leetcode.com/contest/weekly-contest-302/problems/maximum-number-of-pairs-in-array/

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        if(nums.length == 1 ){
            ans[0]=0; ans[1]=1;
            return ans;
        }
        
        int len = nums.length;
        
        HashMap<Integer, Integer> m1 = new HashMap<>();
        for(int i : nums){
            if(m1.containsKey(i)) m1.put(i, m1.get(i)+1);
            else  m1.put(i,1);
        }
        // System.out.println(m1);
        int count=0;
        for(int i : m1.keySet()){
            int x = m1.get(i);   count += x/2;   m1.put(i, x%2);
        }
        // System.out.println(m1);
        int left=0;
        for(int i : m1.keySet()){
            if(m1.get(i) == 1) left++;
        }
        ans[0]=count;    ans[1]=left;
        return ans;
    }
}