class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    
//  approach-1 ---> brute force--> linear traversal of complete array  --> time complexity--O(n*m)
//  approach-2 --> apply binary search at every row check if target element exists or not  time complexity--O(nlogm)
//  approach 3....checking last element of 1st row and comparing
        int r = matrix.length;
        int c = matrix[0].length;
        
        return helper(0, c-1, target, matrix);
    }
    
    public boolean helper(int i, int j, int t, int[][] arr){
        int r=arr.length;    int c=arr[0].length;
        if(i>=r || j<0) return false;
        
        boolean flag =false;
        if(arr[i][j] == t) return true;
        else if(arr[i][j]>t) flag = helper(i, j-1, t, arr);
        else flag = helper(i+1, j, t, arr);
        return flag;
    }
}