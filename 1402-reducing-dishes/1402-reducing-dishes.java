class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        // for(int i: satisfaction)   System.out.println(i+" ");
        // Arrays.sort(satisfaction);
        // for(int i: satisfaction)   System.out.println(i+" ");

        // int pos=0, neg=0
        // for(int i : satisfaction){
        //     if(i<0) neg++;
        //     else pos++;
        // }
        // if(neg == satisfaction.length)  return 0;
        // else if(pos == satisfaction.length){
        //     int sum = 0;
        //     for(int i=0;i<satisfaction.length;i++) sum = sum + (i*satisfaction[i]);
        //     return sum;
        // }
        int pre=0, sum=0;
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        for(int i=n-1;i>=0;i--){
            pre += satisfaction[i];
            if(pre < 0)   break;
            sum += pre;
        }
        return sum;
    }
}

// approach -> fix the array in decreasing order

// example --> [-1,-8,0,5,-9]   --> [-9,-8,-1,0,5]


// [4, 3, 2]  --> [2,3,4]


// [-1,-4,-5]   -->  