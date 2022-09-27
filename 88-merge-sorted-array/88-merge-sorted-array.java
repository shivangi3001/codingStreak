class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int n1=0,n2=0,i=0;
        while(n1<m && n2<n){
            if(nums1[n1]<=nums2[n2])  arr[i++]=nums1[n1++];
            else arr[i++]=nums2[n2++];
        }
        while(n1<m)  arr[i++]=nums1[n1++];
        while(n2<n)  arr[i++]=nums2[n2++];
        
        for(int j=0;j<arr.length;j++) nums1[j]=arr[j];
        
    }
}