// approach -1 --->hashing
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int[] freq = new int[len+1];
        
        for(int i : nums){
            freq[i]++;
        }
        int val=0;
        for(int i=0;i<=len;i++){
            if(freq[i]==0)  val=i;
        }
        return val;
    }
}