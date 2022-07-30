class Solution {
    public int fillCups(int[] amount) {
    // 3 edge/corner cases

    // 1st case when when all 3 cups have equal amount
        if(amount[0] == amount[1] && amount[1]==amount[2]){
            int sum = amount[0]*3;
            if(sum %2 ==0) return sum/2;
            else return sum/2+1;
        }
        
    // 2nd case when maximum aount out of 3 cups is greater than the sum of rest 2
        int maxi = Math.max(amount[0], amount[1]);
        maxi = Math.max(maxi, amount[2]);
        int time=0;
        
        int sumt = amount[0]+amount[1]+amount[2];
        int lhs = sumt-maxi;
        if(maxi>=lhs) return maxi;

        // rest all the cases
        else{
            // Arrays.sort(array, Collections.reverseOrder());
            Arrays.sort(amount);
            // for(int i=0;i<3;i++) System.out.print(amount[i]+" ");
            // System.out.println();
            while(amount[0]>0 && amount[1]>0 && amount[2]>0){
                if(amount[1]>0 && amount[2]>0){
                    time++;  amount[1]--; amount[2]--;
                    // System.out.println(amount[0]+" "+amount[1]+" "+amount[2]+" "+time);
                    Arrays.sort(amount);
                }
                else break;
            }
            time += amount[2];
            return time;
        }
        
        
        // return -1;
        // if(amount[0] == 0 && amount[1] == 0 && amount[2] == 0)   return 0;
        // int time=0;
        // while(amount[0] != 0 || amount[1] != 0 || amount[2] != 0){
        //     if(amount[0] != 0  && amount[1] != 0){
        //         amount[0]--;   amount[1]--;    time++;
        //     }
        //     if(amount[1] != 0  && amount[2] != 0){
        //         amount[1]--;   amount[2]--;    time++;
        //     }
        //     if(amount[0] != 0  && amount[2] != 0){
        //         amount[0]--;   amount[2]--;    time++;
        //     }
        //     if(amount[0] != 0  &&(amount[1]==0 && amount[2]==0)){
        //         time += amount[0];   amount[0]=0;
        //     }
        //     if(amount[1] != 0  &&(amount[0]==0 && amount[2]==0)){
        //         time += amount[1];   amount[1]=0;
        //     }
        //     if(amount[2] != 0  &&(amount[1]==0 && amount[0]==0)){
        //         time += amount[2];   amount[2]=0;
        //     }
        // }
        // return time;
        
    }
}