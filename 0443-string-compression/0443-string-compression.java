// leetcode daily challenge -> 2nd March 2023

// 2-pointer approach
class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        if(len == 1)  return 1;

        ArrayList<Character> l1 = new ArrayList<>();

        int i=0; int j=1;
        while(j<len){
            if(chars[i] != chars[j]){
                l1.add(chars[i]);
                String num = ""+(j-i);
                if( j-i > 1 && j-i<10 ) l1.add(num.charAt(0));
                if( j-i > 9){
                    for(char ch : num.toCharArray())  l1.add(ch);
                }  
                i=j;
            }
            j++;
        }
        l1.add(chars[j-1]);
        String num = ""+(j-i);
        if( j-i > 1 && j-i<10 ) l1.add(num.charAt(0));
        if( j-i > 9){
            
            for(char ch : num.toCharArray())  l1.add(ch);
        }
        for(int k=0;k<l1.size();k++)  chars[k] = l1.get(k);
        System.out.println(l1);
        return l1.size();

    }
}