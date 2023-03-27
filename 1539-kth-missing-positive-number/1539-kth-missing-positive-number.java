class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> l1 = new ArrayList<>();

        List<Integer> l2 = new ArrayList<>();
        for(int i :  arr)  l2.add(i);

        int i=1;  
        while(l1.size() < k ){
            // System.out.println(l2.contains(i));
            if(!l2.contains(i)) l1.add(i);
            i++;
        }
        System.out.println(l2+"->"+l1);
        return l1.get(k-1);
    }
}