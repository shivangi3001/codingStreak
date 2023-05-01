// leetcode daily challenge - 1st May

// Runtime: 0 ms      Beats:  100%
class Solution {
    public double average(int[] salary) {
        int n = salary.length;

        Arrays.sort(salary);
        double sum = 0.00000;

        for(int i=1;i<n-1;i++){
            sum += salary[i];
        }

        return sum/(n-2);
    }
}