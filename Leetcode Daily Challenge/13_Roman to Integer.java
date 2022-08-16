// testcases
// "III"
// "LVIII"
// "MCMXCIV"
// "MMCDXXV"
// "X"

// brute force approach ----runtime 3ms
class Solution {
    public int romanToInt(String str) {
        int len = str.length();
        if(len==1){
            if(str.charAt(0) == 'I') return 1;
            else if(str.charAt(0) == 'V') return 5;
            else if(str.charAt(0) == 'X') return 10;
            else if(str.charAt(0) == 'L') return 50;
            else if(str.charAt(0) == 'C') return 100;
            else if(str.charAt(0) == 'D') return 500;
            else if(str.charAt(0) == 'M') return 1000;
        }
        int val=0;
        for(int i=0; i<len-1; i++){
            char ch = str.charAt(i);
            if(ch=='M'){
                val += 1000;
            }
            else if(ch=='D')  val += 500;
            else if(ch=='C'){
                if(str.charAt(i+1)=='M'){ 
                    val += 900; i++;
                    // System.out.println(val+"->"+i);
                }
                else if(str.charAt(i+1)=='D'){ 
                    val += 400; i++;
                    // System.out.println(val+"->"+i);
                }
                else val += 100;
            }
            else if(ch=='L')  val += 50;
            else if(ch=='X'){
                if(str.charAt(i+1)=='C'){ 
                    val += 90; i++;
                    // System.out.println(val+"->"+i);
                }
                else if(str.charAt(i+1)=='L'){ 
                    val += 40; i++;
                    // System.out.println(val+"->"+i);
                }
                else val += 10;
            }
            else if(ch=='V')  val += 5;
            else if(ch=='I'){
                if(str.charAt(i+1)=='X'){ 
                    val += 9; i++;
                    // System.out.println(val+"->"+i);
                }
                else if(str.charAt(i+1)=='V'){ 
                    val += 4; i++;
                    // System.out.println(val+"->"+i);
                }
                else val += 1;
            }
            
        }
        String s1 = str.substring(len-2);
        // System.out.println(s1);
        int out;
        if(s1.equals("IV") || s1.equals("IX") || s1.equals("XL") || s1.equals("XC") || s1.equals("CD") || s1.equals("CM")) out=val;
        else if(str.charAt(len-1)=='V') out=val+5;
        else if(str.charAt(len-1)=='X') out=val+10;
        else if(str.charAt(len-1)=='L') out=val+50;
        else if(str.charAt(len-1)=='C') out=val+100;
        else if(str.charAt(len-1)=='D') out=val+500;
        else if(str.charAt(len-1)=='M') out=val+1000;
        else out=val+1;
        return out;
    }
}