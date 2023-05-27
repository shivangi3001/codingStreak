// array - 2pointer - medium
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer>pos = new ArrayList<>();
        List<Integer>neg = new ArrayList<>();

        for(int i : nums){
            if(i>0) pos.add(i);
            else neg.add(i);
        }
        System.out.println(pos.size()+" "+neg.size());

        int l = pos.size();
        int[] ans = new int[n];

        int i=0;
        for(int j=0;j<l;j++){
            ans[i++] = pos.get(j);
            ans[i++] = neg.get(j);
        }
        return ans;
    }
}