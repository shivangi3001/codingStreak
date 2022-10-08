
// testcases -- [1,2,3]
// [4,3,2,1]
// [9]
// [1,9]

class Solution {
    public int[] plusOne(int[] digits) {

        // int len = digits.length;
        // if(digits[len-1]<9){
        //     digits[len-1]++;
        //     return digits;
        // }
        // int[] arr = new int[len+1];
        // int rev=0;
        // for(int i : digits){
        //     rev= rev*10 +i;
        // }
        // rev++;
        // System.out.println(rev);
        // for(int i=len;i>=0;i--){
        //     int rem = rev%10;
        //     rev=rev/10;
        //     arr[i]=rem;
        // }
        // return arr;
        
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
        }
        
        int[] arr = new int[digits.length+1];
        arr[0]=1;
        return arr;
        
    }
}