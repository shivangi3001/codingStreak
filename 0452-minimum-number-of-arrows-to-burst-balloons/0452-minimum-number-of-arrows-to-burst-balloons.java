// leetcode daily challenge --> 5th Jan2023
// Runtime 2079 ms    Beats 5.1%     Memory 130.3 MB  Beats 5.10%

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0]-b[0] );

        for(int i=0;i<points.length;i++)  System.out.print(points[i][0]+" "+points[i][1]+" ");
        System.out.println();

        long s = points[points.length-1][0];
        long e = points[points.length-1][1];
        int c=0;

        // for(int i=0;i<points.length;i++){
        //     if(points[i][0] < 0)
        // }

        for(int i=points.length-2;i>=0;i--){
            System.out.println(points[i][0]+" "+points[i][1]+" "+e+" "+c);
            if(points[i][0] <= e && points[i][1] >=s ) continue;
            else{
                s = points[i][0];
                e = points[i][1];
                c++;
            }
        }
        return c+1;
    }
}

// testcases
// [[1,4],[2,5],[4,6],[7,12]]
// [[10,16]]
// [[-2147483646,-2147483645],[2147483646,2147483647]]
// [[1,2],[-4,-3],[5,6],[-8,-7]]
// [[3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]]