class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        divide(nums,0,n-1);
        return nums;
    }
    
    public void divide(int[] arr, int s, int e){
        if(s>=e) return;
        
        int m = s+(e-s)/2;
        divide(arr,s,m);
        divide(arr,m+1,e);
        conquer(arr,s,m,e);
    }
    
    public void conquer(int[] arr, int s, int m, int e){
        int[] merged = new int[e-s+1];
        int id1=s;
        int id2=m+1;
        int x=0;
        
        while(id1<=m && id2<=e){
            if(arr[id1]<=arr[id2])  merged[x++]=arr[id1++];
            else    merged[x++]=arr[id2++];
        }
        while(id1<=m)  merged[x++]=arr[id1++];
        while(id2<=e)    merged[x++]=arr[id2++];
        
        for(int i=0,j=s;i<merged.length;i++, j++)  arr[j]=merged[i];
    }
}