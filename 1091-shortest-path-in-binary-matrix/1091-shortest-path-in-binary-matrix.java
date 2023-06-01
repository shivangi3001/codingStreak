// leetcode daily challenge - 1st June
// BFS queue

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        if(m==1 && grid[0][0]==0) return 1;
        if(grid[0][0] != 0  || grid[m-1][m-1] != 0)  return -1;

        // Queue<Integer> q1 = new ArrayDequeu<>();
        // Set<Integer> s1 = new HashSet<>();

        // while(!q1.isEmpty()){

        // }
        Queue<int[]> q1 = new LinkedList<>();
        q1.add(new int[]{0,0,1});    //x,y,c
        grid[0][0]=1;

        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        while(!q1.isEmpty()){
            int si=q1.size();
            while(si-- >0){
                int[] point = q1.poll();
                
                if(point[0] == m-1 && point[1]==m-1)   return point[2];

                for(int[] d :dir){
                    int r = point[0]+d[0];
                    int c = point[1]+d[1];

                    if(r>=0 && c>=0 && r<m && c<m && grid[r][c]==0){
                        q1.add(new int[]{r,c, point[2]+1});
                        grid[r][c] = 1;

                    } 

                }
            }
        }
        return -1;
    }
}