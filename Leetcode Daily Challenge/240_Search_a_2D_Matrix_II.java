
// brute force | binary search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;    int m = matrix[0].length;
        
        if(n==1 && m==1){
            if(matrix[0][0] == target)  return true;
            else return false;
        }
        
        for(int[] i : matrix){
            boolean flag = BS(i, target);
            // System.out.println(i[0]+" -> "+flag);
            if(flag)  return true;
        }
        return false;
    }
    
    public boolean BS(int[] arr, int target){
        int s=0;   int e=arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            // System.out.println(arr[mid]+" mid val");
            if(arr[mid] == target)        return true;
            else if(arr[mid] < target)   s=mid+1;
            else  if(arr[mid]>target)  e=mid-1;
        }
        return false;
    }
}
