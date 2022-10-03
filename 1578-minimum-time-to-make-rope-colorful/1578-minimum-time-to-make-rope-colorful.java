// testcase ---
// i/p --> "abaac"   [1,2,3,4,5]               o/p--3
// "abc"       [1,2,3]                              0
// "aabaa"     [1,2,3,4,1]                          2
// "aaabbbabbbb"   [3,5,10,7,5,3,5,5,4,8,1]         25

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0; int d=-1;
        int len = colors.length();
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i =0;i<len;i++)  list.add(needeTime[i]);
        
        for(int i=1;i<len;i++){
            if(colors.charAt(i-1) == colors.charAt(i)){
                int max = Math.max(neededTime[i-1], neededTime[i]);
                int min = Math.min(neededTime[i-1], neededTime[i]);
                sum += min;
                neededTime[i] = max;
                
            }
        }
        return sum;
    }
}