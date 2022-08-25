
// bit manipulation approach -- 2ms
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums){
            result = result^i;
        }
        return result;
    }
}

// hashmap approach --- 12ms
// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i : nums){
//             if(hm.containsKey(i))  hm.put(i, hm.get(i)+1);
//             else   hm.put(i, 1);
//         }
        
//         int val =0;
//         for(int i : hm.keySet()){
//             if(hm.get(i) == 1)  val =i;
//         }
//         return val;
//     }
// }