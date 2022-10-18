// Runtime: 76 ms, faster than 5.06% 
// Memory Usage: 73.2 MB, less than 5.44% 
    
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> l1 = new ArrayList<>();
//         HashMap<Integer, Integer> hm = new HashMap<>();
        
//         for(int i : nums){
//             hm.put(i, hm.getOrDefault(i,0)+1);
//             if(hm.get(i)>1) l1.add(i);
//         }
//         return l1;
//     }
// }
    
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        int len = nums.length;
        int[] freq = new int[len+1];
        
        for(int i : nums){
            freq[i]++;
            if(freq[i]>1) l1.add(i);
        }
        return l1;
    }
}