class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
            if(hm.get(i)>1) l1.add(i);
        }
        return l1;
    }
}