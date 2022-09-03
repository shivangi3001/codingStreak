// testcases
// input--- 3 7
// 2  1
// 2  0

// output---  [181,292,707,818,929]
// [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
// [11,22,33,44,55,66,77,88,99]

class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        // if(n == 1) return new int[] {0,1,2,3,4,5,6,7,8,9};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<10;i++){
            dfs(n,k,i,0,i,list);
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        
    }
    
    public static void dfs(int n, int k, int curr, int idx, int prev, ArrayList<Integer>res){
        if(idx == n-1){
            res.add(curr);   return;
        }
        
        
        int next = prev+k;
        if(next<10 && k!=0)  dfs(n,k, (curr*10)+next, idx+1, next, res);
        
        next = prev-k;
        if(next>=0 )   dfs(n,k, (curr*10)+next, idx+1, next, res);
    }
}