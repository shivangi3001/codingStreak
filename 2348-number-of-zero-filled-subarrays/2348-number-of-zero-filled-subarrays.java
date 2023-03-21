// leetcode daily challenge -> 21st MArch 2023


class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i] != 0)  j=i+1;
            res = res +(i-j+1);
        }
        return res;
    }
}

// [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

// for this code only 11/48 testcases passed --> got runtime error for 14/48 testcases
// nums = [0,1,0,0,1,0,0,0]
// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         long count =0;
//         HashMap<Integer, Integer> m1 = new HashMap<>();
//         for(int i : nums){
//             if(i == 0){
//                 count++;
//                 if(m1.containsKey(i))  m1.put(i, m1.get(i)+1);
//                 else   m1.put(i,1);
//                 System.out.println("count: "+count);
//             }
//             if(m1.get(0) != null && i!=0){
//                int a = m1.get(0);
//                if(a>1){
//                    long c = fact(a)/(fact(a-2)*2);
                   
//                    count += c;
//                    System.out.println("a: "+a+"->cFact "+c+"->count "+count);
                   
//               }
//               m1 = new HashMap<>();
//             }
//         }
//         if(nums[nums.length-1] == 0){
//             int a = m1.get(0);
//            if(a>1){
//                long c = fact(a)/(fact(a-2)*2);               
//                 count += c;
//             }    
//         }
//         return count;
//     }

//     public long fact(int n){
//         long[] dp = new long[n+1];
//         if(n<2) return 1;
//         dp[0]=1;     dp[1]=1;
//         for(int i=2;i<=n;i++) dp[i] = i*dp[i-1];
//         return dp[n];
//     }
// }


// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         long count =0;
// //         HashMap<Integer, Integer> m1 = new HashMap<>();
// //         for(int i : nums){
// //             if(i == 0){
// //                 count++;
// //                 if(m1.containsKey(i))  m1.put(i, m1.get(i)+1);
// //                 else   m1.put(i,1);
// //                     System.out.println("cou: "+count);
// //             }
// //             else{
// //                int a = m1.get(0);
// //                if(a>1){
// //                    long c = fact(a)/(fact(a-2)*2);
// //                    System.out.println("a: "+a+"->c "+c+"->count "+count);
// //                    count += c;
// //                    m1 = new HashMap<>();
// //               }
// //           }
                
// //         }
        
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i : nums){
//             if(i == 0){
//                 count++;  list.add(i);
//             }
// //             else if(i !=0){
// //                 if(list.size() > 1) {
// //                     int a = list.size();
// //                     long c = fact(a)/(fact(a-2)*2);
// //                    System.out.println("a: "+a+"->c "+c+"->count "+count);
// //                    count += c;
// //                 }   
// //                 list = new ArrayList<>();
                
// //             }
//         }
//         if(list.size()>1){
//             long a = list.size();
//                     long c = fact(a)/(fact(a-2)*2);
//                     System.out.println("a: "+a+"->c "+c+"->count "+count);
//                     count += c;
//             list = new ArrayList<>();
//         }
//         // System.out.println(m1);
        
        
        
        
// //         stack based approach
//         // Stack<Integer> st = new Stack<>();
//         // for(int i : nums){
//         //     if(i == 0){
//         //         count++;  st.push(i);
//         //         System.out.println("cou: "+count);
//         //     }
//         //     else{
//         //         if(st.size()>1){
//         //             long a = st.size();
//         //             long c = fact(a)/(fact(a-2)*2);
//         //             System.out.println("a: "+a+"->c "+c+"->count "+count);
//         //             count += c;
//         //         }
//         //         while(st.size() != 0)  st.pop();
//         //     }
//         // }
//         // if(st.size()>1){
//         //     long a = st.size();
//         //             long c = fact(a)/(fact(a-2)*2);
//         //             System.out.println("a: "+a+"->c "+c+"->count "+count);
//         //             count += c;
//         // }
        
//         return count;
        
//     }
    
//     public long fact(long n){
//         if(n==0 || n==1) return 1;
//         return n*fact(n-1);
//     }
// }