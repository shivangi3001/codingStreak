// Runtime: 13 ms   Beats: 29.55%
class Solution {
    public String predictPartyVictory(String senate) {
        
        int n = senate.length();
        if(n==1){
            if(senate.charAt(0)=='R')  return "Radiant";
            return  "Dire";
        }

        Queue<Integer> r = new ArrayDeque<>();
        Queue<Integer> d = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='D') d.add(i);
            else  r.add(i);  
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int r1 = r.poll();    int d1 = d.poll();

            if(r1<d1)  r.add(r1+n);
            else d.add(d1+n);
        }

        return r.size()>d.size() ? "Radiant" : "Dire";
    }
}