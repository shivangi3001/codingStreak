class Solution {
    public int minSwaps(int[] nums) {
        
//optimal approach -- runTime - 18ms
        int len = nums.length;
//  finding total no. of Ones in whole array
        int Ones =0;
        for(int i : nums){  if(i==1)  Ones++;  }
        
//  check if total no. of ones ==0 || equal to len -> then return 0
        if(Ones==0 || Ones==len)  return 0;
        
//  for rest of the cases -> circular array so aapending original array at end of array
        int[] arr = new int[2*len];
        for(int i=0;i<len;i++){
            arr[i] = nums[i];
            arr[len+i] = nums[i];
        }

// sliding window approach of fixed range where window size==no. of Ones
        int mini = Integer.MAX_VALUE;
        int count = 0;
        for(int j=0;j<Ones;j++){
            if(arr[j]==0) count++;
        }
        mini = Math.min(mini, count);
        int x = 2*len-Ones;

        for(int i=0;i<x;i++){
            if(arr[i]==0 && arr[i+Ones]==1) count--;
            else if(arr[i]==1 && arr[i+Ones]==0) count++;
            mini = Math.min(mini, count);
            // System.out.println("mini->"+mini+" count->"+count);
            
        }
        // System.out.println();
        
        return mini;
        
        
// //      approach sliding window----got runtime error
// //      step1 -- counting the total no of ones
//         int c=0;
//         ArrayList<Integer>list = new ArrayList<>();
//         for(int i : nums){
//             if(i == 1) c++;
//             list.add(i);
//         }
//         // System.out.println(list+"->"+c);
        
// //      appending the original array again
//         for(int i: nums) list.add(i);
//         // System.out.println(list);
        
// //         slding window of size of ones and finding max ones
//         int max1=0;
//       for(int i=0;i<2*(nums.length)-c;i++){
//           int count=0;
//           for(int j=i;j<i+c;j++){
//               if(list.get(j) == 1) count++;
//           }
//           // System.out.println(max1+"=count=>"+count);
//           if(count>max1) max1=count;
//       }
//       // System.out.println(max1+"==>"+c);
        

        
// //         ans = no. of ones - max ones
//         return c-max1;
        
    }
}