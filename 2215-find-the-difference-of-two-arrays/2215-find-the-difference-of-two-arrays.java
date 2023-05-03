// daily leetcode challenge - 3rd May

// Runtime: 12 ms   Beats: 64.30%
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n1 = nums1.length;    int n2 = nums2.length;

        List<List<Integer>> l3 = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i : nums1)  s1.add(i);
        for(int i : nums2)  s2.add(i);

        for(int i : s1){
            if(!s2.contains(i))   ans1.add(i);
        }
        for(int i : s2){
            if(!s1.contains(i))  ans2.add(i);
        }
        l3.add(ans1);
        l3.add(ans2);
        
        return l3;
    }
}