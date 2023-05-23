// leetcode daily challenge - 23rd May
class KthLargest {
    List<Integer> l1;
    int n;

    public KthLargest(int k, int[] nums) {
        l1 = new ArrayList<>();
        for(int i : nums) l1.add(i);
        n=k;
    }
    
    public int add(int val) {
        l1.add(val);
        Collections.sort(l1);
        int len = l1.size();
        return l1.get(len-n);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */