//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
         	int target = sc.nextInt();
         	
			Solution x = new Solution();
			
			if (x.search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 
			t--;
		}
	} 
}
// } Driver Code Ends




class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    return helper(matrix, 0, m-1, x);
	}
	
	static boolean helper(int[][] arr, int i, int j, int t){
	    if(i>=arr.length || j<0) return false;
	    
	    boolean flag=false;
	    if(arr[i][j] == t) return true;
	    if(arr[i][j]>t)  flag= helper(arr,i,j-1,t);
	    else if(arr[i][j]<t)  flag = helper(arr,i+1,j,t);
	    return flag;
	}
} 
