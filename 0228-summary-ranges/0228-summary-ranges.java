// leetcode daily challenge - 12th June

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        
        List<String> l1 = new ArrayList<>();
        if(len == 0) return l1;
        
        int s = nums[0];  int e=nums[0];
        if(len ==1){
            l1.add(""+s);
            return l1;
        }

        // l1.add(""+s+"->");
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1] == 1) e=nums[i];
            else{
                if(s >= e) l1.add(""+s);
                else       l1.add(""+s+"->"+e);
                s=nums[i];
            }
        }
        System.out.println(s+" "+e);
        if(s>e) l1.add(""+s);
        else l1.add(""+s+"->"+e);

        return l1;
    }
}