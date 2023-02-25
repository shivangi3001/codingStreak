// leetcode daily challenge - 25th Feb
class Solution {
    public int maxProfit(int[] prices) {
        
        int lvsf = Integer.MAX_VALUE;
        int pist = 0;
        int maxProfit = 0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lvsf) lvsf = prices[i];
            pist = prices[i]-lvsf;
            if(pist>maxProfit) maxProfit = pist;
        }
        return maxProfit;
        
//         int max =0;
        
//         int len = prices.length;
//         for(int i=len-1;i>0;i--){
//             for(int j=0;j<len-1;j++){
//                 if(prices[j]<prices[i] && j<i){
//                     int val = prices[i] - prices[j];
//                     if(val>max) max =val;
//                 }
//             }
//         }
//         return max;
        
        // int len =prices.length;
        // if(len == 1) return 0;
        // SortedSet <Integer> list = new TreeSet<> ();
        // for(int i=0;i<len;i++){
        //     for(int j = i+1;j<len;j++){
        //         if(prices[i]>prices[j]) continue;
        //         else{
        //             int profit = prices[j]-prices[i];
        //             list.add(profit);
        //         }
        //     }
        // }
        // // System.out.println(list+" -> "+list.size()+" "+list.first()+" "+list.last());
        // if(list.size() == 0) return 0;
        // else  return list.last();
        
    }
}