// leetcode daily challenge - 5th June

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n==2) return true;

        int y1=coordinates[0][1];     int y2=coordinates[1][1];
        int x1=coordinates[0][0];     int x2=coordinates[1][0];
        int dy=y2-y1;  int dx=x2-x1;

        for(int i=2;i<n;i++){
            int yy=coordinates[i][1];      int xx=coordinates[i][0];
            int y=coordinates[i-1][1];     int x=coordinates[i-1][0];
            int ddy=yy-y;       int ddx=xx-x;
            if(dy*ddx != dx*ddy)  return false;
        }
        return true;

    }
}