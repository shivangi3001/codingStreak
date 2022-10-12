// testcases--[2,1,2]
// [1,2,1]
// [1,2,1,2]
// [3,2,3,4]
// [3,6,2,3]

class Solution {
    public int largestPerimeter(int[] nums) {
        int len = nums.length; int overMax=0;
        Arrays.sort(nums);
        for(int i=0;i<=len-3;i++){
            int sum=0;
            if(!isTri(nums,i,i+3))  {  overMax= Math.max(0, overMax);  }
            else{
            sum = nums[i]+nums[i+1]+nums[i+2];
            if(sum>overMax) overMax=sum;
            }
        }
        return overMax;
    }
    
    public boolean isTri(int[] arr, int l, int r){
        int a = arr[l];
        int b=arr[l+1];   int c=arr[l+2];
        // System.out.println(a+" "+b+" "+c);
        // System.out.println((a+b>c) && (b+c>a) && (c+a>b));
        if((a+b>c) && (b+c>a) && (c+a>b)){
            return true;
        }
        return false;
    }
}