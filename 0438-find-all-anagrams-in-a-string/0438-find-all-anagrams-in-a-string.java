// leetcode daily challenge -> 5th Feb 2023

// Runtime 663 ms    Beats 14.20%
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

         if (s == null || p == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int l1=s.length();   int l2=p.length();
        if (l1 * l2 == 0 || l1 < l2)    return list;

        int[] freq1 = new int[26];

        for(char ch : p.toCharArray()) freq1[ch-'a']++;

        for(int i=0;i<l1-l2+1;i++){
            int[] freq2 = new int[26];
            String s1 = s.substring(i,l2+i);
            // System.out.println(s1);
            for(char ch : s1.toCharArray()) freq2[ch-'a']++;
            if(Arrays.equals(freq1, freq2)) list.add(i);
        }
        return list;
    }
}