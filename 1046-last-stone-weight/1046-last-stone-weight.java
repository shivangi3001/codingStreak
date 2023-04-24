// leetcode daily challenge - 24th April

// array, priority queue
class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        if(len == 1)  return stones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones)   pq.add(i);

        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if(pq.size()==0  && a==b)  return 0;

            if(a != b) pq.add(a-b);
        }
        return pq.peek();
    }
}