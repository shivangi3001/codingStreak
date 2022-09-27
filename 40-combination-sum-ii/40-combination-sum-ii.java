// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
// //   time complexity--> 2^n + k(logn) got TLe for hugh input
//         Set<List<Integer>> l1 = new HashSet<>();
//         // List<List<Integer>> l1 = new ArrayList<>();
//         List<Integer> l2 = new ArrayList<>();
//         Arrays.sort(candidates);
//         helper(candidates,0,target,l1,l2);
// //         convert set to list
//         List<List<Integer>> list = new ArrayList<>(l1);
//         return list;
//     }
    
//     public void helper(int[] arr, int idx, int t, Set<List<Integer>>l1, List<Integer>l2){
//         if(idx==arr.length){
//             if(t==0) l1.add(new ArrayList<>(l2));
//             return;
//         }
        
//         if(arr[idx]<=t){
//             l2.add(arr[idx]);
//             helper(arr,idx+1, t-arr[idx], l1, l2);
//             l2.remove(l2.size()-1);
//         }
//         helper(arr, idx+1, t, l1,l2);
//     }
// }



class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,l1, new ArrayList<Integer>());
        return l1;
    }
    
    public void helper(int[] arr, int idx, int t, List<List<Integer>> l1, List<Integer> l2){
        if(t==0){
            l1.add(new ArrayList<>(l2)); return;
        }
        if(t<0) return;
        
        for(int i=idx;i<arr.length;i++){
            if(i==idx || arr[i]!=arr[i-1]){
                l2.add(arr[i]);
                helper(arr,i+1,t-arr[i],l1,l2);
                l2.remove(l2.size()-1);
            }
        }
    }
}