// testcase
// [[1,5,9],[10,11,13],[12,13,15]]   8
// [[-5]]    1
// [[1,2],[3,4]]   2
// [[1,2],[1,3]]   2

// output 
// 13
// -5
// 2
// 1



class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
//         some mathematical approach did not pass all the testcases
//         int n = matrix.length;
//         if(n == 1 && k == n)  return matrix[0][0];
        
//         int row = k/n;  
//         int col = k%n;   col=col-1;
//         if(col+1 ==0){
//             col=n-1;   row=k/n -1;
//         }
//         //System.out.println(row+"->"+col+"->"+matrix[row][col]);
//         return matrix[row][col];
        
//         brute force approach O(n^2) time complexity passed all test cases
//         Runtime: 27 ms  Memory Usage: 56.6 MB
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                list.add(matrix[i][j]);
            }
        }
        // System.out.println(list);
        Collections.sort(list);
        //System.out.println(list);
        return list.get(k-1);
    }
}