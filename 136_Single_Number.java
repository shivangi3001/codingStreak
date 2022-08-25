class Solution {
    public int singleNumber(int[] nums) {
//         int a = nums[0];
//         int len = nums.length;
        
//         for(int i=1;i<len;i++){
//             a = a^nums[i];
//             System.out.println(a);
//         }
//         return -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            if(hm.containsKey(i))  hm.put(i, hm.get(i)+1);
            else   hm.put(i, 1);
        }
        
        int val =0;
        for(int i : hm.keySet()){
            if(hm.get(i) == 1)  val =i;
        }
        return val;
    }
}