class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;

        List<Boolean> l1 = new ArrayList<>();
        int max = 0;

        for(int i : candies)  max = Math.max(max, i);

        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >= max) l1.add(true);
            else l1.add(false);
        }
        return l1;
    }
}