// leetcode daily challenge  ->  8th March

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int x : piles)
            max = Math.max(max, x);
        
        int l = 1; 
        int r = max;
        while(l < r){
            int mid = l + (r - l) / 2;
            
            if(canFinish(piles, mid, h))
                r = mid;
            else
                l = mid + 1;
        }
        
        return l;
    }
    
    private boolean canFinish(int[] piles, int k, int h){
        int hour = 0;
        for (int bananas : piles){
            int temp = bananas % k == 0 ? 0 : 1;
            hour += bananas / k + temp;
        }
        
        if(hour <= h)
            return true;
        return false;
    }
}

// trial code --> failed for this testcase
// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         // int k=0;

//         int len = piles.length;
//         Arrays.sort(piles);
//         if(len == h) return piles[len-1];

//         // apply binary search
//         int l=0;
//         int hi = piles[len-1];
//         int speed = Integer.MAX_VALUE;
           
//         while(l <= hi){
//             int mid = l +(hi-l)/2;
//             System.out.println("l->"+l+" high->"+hi+" "+mid);

//             if(isPossible(piles,mid,h)){
//                 speed = mid;
//                 hi = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return speed;
//     }

//     public boolean isPossible(int[] piles, int mid, int h){
//         int sum=0;
//         for(int i : piles){
//             sum += (int)Math.ceil(i*1.0/mid);
//             System.out.println(i+" "+mid+" "+sum);
//         }
//         if(sum <= h) return true;
//         return false;
//     }
// }

// approach -> if we can sort the array and then set the
// eating speed or k value to be arr[len-1]
// then h == arr[len]


// h=8    [3,6,7,11]        --> 
// h=5    [30,11,23,4,20]   --> [4,11,20,23,30]

// [3,6,7,11] -> 3%8, 6&8, 7%8, 11&8 --> 3+6+7+3 = 19  -> h=8  19&8 ->3+1=4
// [30,11,23,4,20] -> h=5  --> 0+1++3+4+0 -> 8 ->8%5=3
// [30,11,23,4,20] -> h=6  


// [3,6,7,11] ->       3+6+7+11 -> 27 -> 27/8 ->3
// [30,11,23,4,20] ->  30+11+12+4+20 = 