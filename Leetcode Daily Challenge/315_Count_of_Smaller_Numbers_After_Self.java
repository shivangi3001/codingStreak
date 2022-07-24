


// brute force approach time limit exceeded for large input
class Solution {

    public List<Integer> countSmaller(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = afterSelf(nums,i);
            list.add(n);
        }
        
        return list;
    }
    
    public int afterSelf(int[] arr, int n){
        int c=0;
        for(int i=n+1;i<arr.length;i++){
            if(arr[n]> arr[i]) c++;
        }
        return c;
    }
}