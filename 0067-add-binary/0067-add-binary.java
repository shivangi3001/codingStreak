// leetcode daily challenge -> 14th feb 2023

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        
        sa = sa.reverse();    sb=sb.reverse();
        // System.out.println(sa+" "+sb);
        int c=0;
        StringBuilder ans = new StringBuilder();
        int l1 = sa.length();   int l2=sb.length();
        int min = Math.min(l1, l2);
        for(int i=0;i<min;i++){
            int x = Integer.parseInt(""+sa.charAt(i)) + Integer.parseInt(""+sb.charAt(i)) +c;
            if(x == 0 || x==1){  ans.append(""+x);   c=0;  }
            else{
                if(x==2)  ans.append(""+0);
                if(x==3)  ans.append(""+1);
                c=1;
            }
        // System.out.println(ans+" "+c);
        }
        // System.out.println(c);
        if(l1-l2>0){
            for(int i =l2; i<l1;i++){
            int x = Integer.parseInt(""+sa.charAt(i)) +c;
            if(x == 0 || x==1){  ans.append(""+x);   c=0;  }
            else{
                if(x==2)  ans.append(""+0);
                if(x==3)  ans.append(""+1);
                c=1;
            }
            }
        // System.out.println(ans+" "+c);
        }
        if(l1-l2 < 0) {
            for(int i = l1;i<l2;i++) {
            int x = Integer.parseInt(""+sb.charAt(i)) + c;
            if(x == 0 || x==1){  ans.append(""+x);   c=0;  }
            else{
                if(x==2)  ans.append(""+0);
                if(x==3)  ans.append(""+1);
                c=1;
            }
            }
        // System.out.println(ans+" "+c);
        }
        if(c!=0) ans.append(c);
        ans = ans.reverse();
        
        return ans.toString();
     }
}