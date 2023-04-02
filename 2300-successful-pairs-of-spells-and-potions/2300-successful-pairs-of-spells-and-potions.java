// leetcode daily challenge - 2nd april

// Runtime:  889 ms      Beats:  7.85%

// binart search approach -> T.C -> O(nlogm)
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;

        int[] pair = new int[n];
        Arrays.sort(potions);

        for(int i=0;i<n;i++){
            int spell = spells[i];
            int l=0;
            int r =m-1;
            while(l <= r){
                int mid = l+(r-l)/2;
                long prod = (long)spell*potions[mid];
                if(prod >= success) r=mid-1;
                else l=mid+1;
            }
            System.out.println(spell+" "+l+" "+r);
            pair[i] = m-l;
        }

        return pair;
    }
}


//51 / 56 testcases passed  --> brute force   -->  got TLE error
// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         int n = spells.length;
//         int m = potions.length;

//         int[] pair = new int[n];

//         for(int i=0;i<n;i++){
//             int c=0;
//             for(int j=0;j<m;j++){
//                 long a = (long)spells[i]*(long)potions[j];
//                 if(a>= success) c++;
//             }
//             pair[i] = c;
//         }

//         return pair;
//     }
// }
