class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        
        Arrays.sort(people);
        int c=0;
        int l=0;   int r=n-1;
        while(l<=r){
            int sum = people[l] + people[r];
            if(sum > limit) c++;
            else{
                c++; l++;
            }
            r--;
        }
        return c;
    }
}