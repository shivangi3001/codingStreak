// testcases
// Example 1:
// Input: grades = [10,6,12,7,3,5]
// Output: 3
// Explanation: The following is a possible way to form 3 groups of students:
// - 1st group has the students with grades = [12]. Sum of grades: 12. Student count: 1
// - 2nd group has the students with grades = [6,7]. Sum of grades: 6 + 7 = 13. Student count: 2
// - 3rd group has the students with grades = [10,3,5]. Sum of grades: 10 + 3 + 5 = 18. Student count: 3
// It can be shown that it is not possible to form more than 3 groups.

// Example 2:
// Input: grades = [8,8]
// Output: 1
// Explanation: We can only form 1 group, since forming 2 groups would lead to an equal number of students in both groups.
 
// Constraints:
// 1 <= grades.length <= 105
// 1 <= grades[i] <= 105


class Solution {
    public int maximumGroups(int[] grades) {
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i : grades)  list.add(i);
//         Collections.sort(list);
        
        // int len = grades.size();
        // int ans = n*(n-1)/2;
        
        int len = grades.length;
        int n=1;
        
        while(n*(n+1)/2 <= len){
            //System.out.println(n+"->"+(n*(n+1)/2)+"->"+len);
            n++;
        }
        return n-1;
    }
}