// leetcode daily challenge -> 15th feb

// Runtime 626 ms    Beats 5.4%
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int k1=k;
        List<Integer>l1 = new ArrayList<>();
        int len=num.length; int carry=0;
        for(int i=len-1;i>=0;i--){
            int sum=carry;
            sum += num[i];
            if(k%10>=0 ){
                System.out.println(k+" "+k/10+" "+k%10);
                sum += k%10;   k=k/10;
            }
            System.out.println(carry+"-> "+sum);
            carry = sum>9?1:0;
            l1.add(sum%10);
        }
        if(k>0){
            while(k>0){
                int a = k%10 + carry;  k=k/10;
                carry = a>9?1:0;
                l1.add(a%10);
            }
        }
        if(carry != 0) l1.add(carry);
        List<Integer>l2 = new ArrayList<>();
        for(int i=l1.size()-1;i>=0;i--) l2.add(l1.get(i));
        return l2;
    }
}

// approach 1 -> got TLE for public testcases
// class Solution {
//     public List<Integer> addToArrayForm(int[] num, int k) {
        
//         int len=num.length;

//         // converting num array and number k to String
//         StringBuilder s1=new StringBuilder();
//         StringBuilder s2=new StringBuilder(""+k);
//         // System.out.println(""+s1+s2);

//         // adding two strings as a number from right to left
//         int i = s1.length()-1;
//         int j = s2.length()-1;
//         int carry=0;
//         StringBuilder ans = new StringBuilder();
//         while(i>=0 || j>=0){
//             int sum=carry;
//             if(i>=0) sum += s1.charAt(i) - '0';
//             if(j>=0) sum += s2.charAt(j) - '0';
//             carry = sum>9?1:0;
//             ans.append(""+sum%10);
//         }
//         if(carry != 0)  ans.append(""+carry);
//         ans = ans.reverse();

//         // converting ans from String datatype to list
//         int n=ans.length();
//         List<Integer> l1 = new ArrayList<>();
//         for(int ch=0;ch<n;ch++) l1.add(ans.charAt(ch)-'0');
//         // for(char ch : ans.toString().toCharArray()){
//         //     l1.add(ch-'0');
//         // }
//         return l1;
//     }
// }