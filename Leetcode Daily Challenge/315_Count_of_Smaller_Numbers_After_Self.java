class Solution {
    public List<Integer> countSmaller(int[] nums) {
        
// //         Brute force approach
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             int n = afterSelf(nums,i);
//             list.add(n);
//         }
        
//         return list;
//     }
    
//     public int afterSelf(int[] arr, int n){
//         int c=0;
//         for(int i=n+1;i<arr.length;i++){
//             if(arr[n]> arr[i]) c++;
//         }
//         return c;
//     }
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        for(int i : nums)  l1.add(i);
        Collections.sort(l1);
        
        for(int i : nums){
            int index = BS(l1,i);
            l2.add(index);
            l1.remove(index);
        }
        return l2;
    }
//     [3,5,2,6,1]    [1,3,5,2,6,1]
    
//     [1,2,3,5,6]    [1,2,3,5,6]
    
//     3                  [1, 2, 2]
        
//     [2, 2, ]
    
    public int BS(ArrayList<Integer>list, int target){
        int s =0;    int e=list.size()-1;
        // int ans=0;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(list.get(mid) > target)  e=mid-1;
            else if(list.get(mid) < target)  s=mid+1;    
            else{
                e=mid-1;
            }
        }
        return s;
    }
}