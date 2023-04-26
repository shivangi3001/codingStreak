// leetcode daily challenge - 25th April

class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>(1000);
        for(int i=1;i<=1000;i++)  pq.add(i);
    }
    
    public int popSmallest() {
        // if(pq.isEmpty())       return  0;
        int x = pq.poll();
        return x;
    }
    
    public void addBack(int num) {
        if(!pq.contains(num))  pq.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */