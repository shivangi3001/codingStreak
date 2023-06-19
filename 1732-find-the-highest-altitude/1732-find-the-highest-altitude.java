// leetcode daily challenge - 19th June

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;

        List<Integer> l1 = new ArrayList<>();
        l1.add(0);

        for(int i=0;i<n;i++){
            int sum = l1.get(i) + gain[i];
            l1.add(sum);
        }
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("sort->"+l1);

        return l1.get(l1.size()-1);
    }
}