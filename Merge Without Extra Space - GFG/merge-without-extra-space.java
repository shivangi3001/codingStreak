//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

// my approach---got TLE error
// class Solution
// {
//     //Function to merge the arrays.
//     public static void merge(long arr1[], long arr2[], int n, int m) 
//     {
//         // code here 
//         int i=0,j=0;
//         while(i<arr1.length && j<arr2.length){
//             if(arr1[i]>arr2[j]){
//                 long t =arr1[i];   arr1[i]=arr2[j];  arr2[j]=t;
//                 i++;
//                 Arrays.sort(arr2);
//             }
//         }
//     }
// }

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i, k;
    for (i = 0; i < n; i++) {
      // take first element from arr1 
      // compare it with first element of second array
      // if condition match, then swap
      if (arr1[i] > arr2[0]) {
        long temp = arr1[i];
        arr1[i] = arr2[0];
        arr2[0] = temp;
      }

      // then sort the second array
      // put the element in its correct position
      // so that next cycle can swap elements correctly
      long first = arr2[0];
      // insertion sort is used here
      for (k = 1; k < m && arr2[k] < first; k++) {
        arr2[k - 1] = arr2[k];
      }
      arr2[k - 1] = first;
    }
        
    }
}