class Solution {
    int time=0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        
        Map<Integer, List<Integer>> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(manager[i] == -1)  continue;
            if(!hm.containsKey(manager[i])){
                List<Integer> l1 = new ArrayList<>();
                l1.add(i);
                hm.put(manager[i], l1);
            }
            else{
                List<Integer> l1 = hm.get(manager[i]);
                l1.add(i);
                hm.put(manager[i], l1);
            }
        }
        System.out.println(hm);
        // recursive dfs call
        count(headID, hm, informTime, 0);
        return time;
    }

    public void count(int head, Map<Integer, List<Integer>> hm, int[] informTime, int t){
        if(informTime[head] == 0)   return;    //conditon for leaves
        t += informTime[head];

        List<Integer> l1 = hm.get(head);
        for(int i=0;i<l1.size();i++){
            count(l1.get(i), hm, informTime, t);
            // System.out.println(l1.get(i)+" "+t+" "+time);
            if(t>time)  time = t;
        }
    }
}