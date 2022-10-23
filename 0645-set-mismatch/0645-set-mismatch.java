class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        
        int len = nums.length;
        int[] freq = new int[len+1];
        
        for(int i : nums) freq[i]++;
        
        for(int i=1;i<=len;i++){
            if(freq[i]>1)   ans[0]=i;
            if(freq[i]==0)  ans[1]=i;
        }
        return ans;
    }
}