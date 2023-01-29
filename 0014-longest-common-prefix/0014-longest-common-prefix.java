// Runtime 3 ms    Beats 34.54%

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len == 1) return strs[0];

        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = strs[i].length();
        }

        Arrays.sort(arr);
        int n = arr[0];

        String ans = "";   String a = "";

        for(int i=0;i<n;i++){
            for(int j=1;j<len;j++){
                if(strs[j-1].charAt(i) != strs[j].charAt(i))  return ans;
                else a = ""+strs[j].charAt(i);
            }
            ans = ans + a;
        }
        return ans;
    }
}