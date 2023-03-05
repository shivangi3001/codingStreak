// leetcode daily challenge -> 5th March 2023

// topic -> array, hashTable, BFS, recusion, DP
class Solution {
    public int minJumps(int[] arr) {
        // int len = arr.length;
        // if(len < 3) return len-1;

        // return helper(len-1, arr[len-1], arr);
        // // return -1;

        int steps=0;
        int  n=arr.length;
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                List<Integer> temp =new ArrayList<>();
                temp.add(i);
                hm.put(arr[i],temp);
            }
            else{
                List<Integer> temp=hm.get(arr[i]);
                temp.add(i);
                hm.put(arr[i],temp);
            }
        }
        boolean vis[]=new boolean[n];
        vis[0]=true;
        Queue<Integer> qu=new LinkedList<>();
        qu.add(0);
        while(!qu.isEmpty()){
            int size=qu.size();
            for(int i=0;i<size;i++){
                int curridx=qu.poll();
                if(curridx==n-1)
                    return steps;
                List<Integer> jumptoindexes=hm.get(arr[curridx]);
                jumptoindexes.add(curridx+1);
                jumptoindexes.add(curridx-1);
                for(int q:jumptoindexes){
                    if(q>=0 && q<n && !vis[q]){
                        vis[q]=true;
                        qu.add(q);
                    }
                }
                jumptoindexes.clear();
            }
            steps++;
        }
        return -1;

    }
    // public int helper(int idx, int ele, int[] arr){
    //     if(idx == 0) return 1;
    //     if(idx<0 || idx>=arr.length) return 0;

    //     int b = helper(idx-1, arr[idx-1], arr);
    //     int f = Integer.MAX_VALUE;
    //     if(idx<arr.length) f = helper(idx+1, arr[idx+1], arr);

    // }
}