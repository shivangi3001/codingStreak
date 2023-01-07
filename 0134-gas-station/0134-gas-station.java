// Leetcode daily challenge --> 7th Jan2023
// Runtime  1 ms        Beats   100%


// referred algo made easy youtube --->  for logic
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos=0;  int sum=0;  int total=0;

        for(int i=0;i<gas.length;i++){
            sum += gas[i] - cost[i];

            if(sum<0){
                total += sum;
                sum=0;
                pos = i+1;
            }

        }
        total += sum;

        return total >=0 ? pos : -1;
        
    }
}

// [3,1,1]
// [1,2,2]