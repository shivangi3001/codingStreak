// leetcode daily challenge - 13th June

class Solution {
    public int equalPairs(int[][] grid) {
        int pair=0;
        int temp=0;
        int row=0;
        while(temp<=grid.length-1)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<grid.length;j++)
            {
                map.put(j,grid[row][j]);
            }
            for(int i=0;i<grid.length;i++)
            {
                int curr=0;
                for(int k=0;k<grid.length;k++)
                {
                    if(map.get(k)!=grid[k][i])
                    {
                        curr=0;
                        break;
                    }
                    else
                        curr=1;
                }
                pair+=curr;
            }
            row++;
            temp++;
        }
        return pair;
    }
}


// class Solution {
//     public int equalPairs(int[][] grid) {
//         int n = grid.length;

//         if(n==1)  return 1;

//         List<List<Integer>> row = new ArrayList<>();
//         List<List<Integer>> col = new ArrayList<>();
//         for(int i=0;i<n;i++)  row.add(new ArrayList<>());
//         for(int j=0;j<n;j++)  col.add(new ArrayList<>());

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 int a = grid[i][j];
//                 row.get(i).add(a);
//                 col.get(j).add(a);
//             }
//         }
//         System.out.println("row->"+row);
//         System.out.println("col->"+col);

//         int c=0;
//         for(int i=0;i<row.size();i++){
//             List<Integer> l1 = row.get(i);
//             if(col.contains(l1)) c++;
//         }
//         return c;
//     }
// }