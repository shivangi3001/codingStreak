// Testcases
// 1
// 10
// 61
// 23
// 610


class Solution {
    public boolean reorderedPowerOf2(int n) {
        
// approach to just find if number is power of 2 or not
//         if(n <= 0)  return false;
//         if(n==1)   return true;
        
//         if(n%2 != 0) return false;
        
//         return reorderedPowerOf2(n/2);
        
// optimal approach of bit manipulation
        int[] countDig = counts(n);
        int num=1;
        for(int i=0;i<31;i++){
            if(Arrays.equals(countDig, counts(num))) return true;
            num = num<<1;
            // System.out.print(num);
        }
        return false;
        
    }
    
    public static int[] counts(int n){
        int[] arr = new int[10];
        while(n>0){
            arr[n%10]++;
            n=n/10;
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}