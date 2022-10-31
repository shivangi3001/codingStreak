class Solution {
    public String countAndSay(int n) {
        if(n==1)  return "1";
        if(n==2)  return "11";
        
        String s = "11";
        for(int i=3;i<=n;i++){
            String t = "";
            s=s+"!";    //adding a delimetier to compare last char
            int c=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j) != s.charAt(j-1) ){
                    t= t+c+s.charAt(j-1);
                    c=1;
                }
                else c++;
            }
            s=t;
        }
        return s;
    }
}




// 1    -1
// 11   -2
// 21   -3
// 1211  -4
// 111221  -5
// 312211  -6
// 13112221  -7 