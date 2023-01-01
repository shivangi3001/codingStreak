
class Solution {
    public String getHint(String secret, String guess) {
        int x=0,y=0;

        int[] num = new int[10];
        for(int i=0;i<secret.length();i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s==g)  x++;
            else{
                // System.out.println(num[s]+" "+num[g]);
                if(num[s] < 0) y++;
                if(num[g] > 0) y++;
                // System.out.println(y);
                num[s]++;   num[g]--;
            }
        }
        return ""+x+"A"+y+"B";
    }
}

// class Solution {
//     public String getHint(String secret, String guess) {
//         int x=0,y=0;

//         char[] ch1 = secret.toCharArray();   //converting string to char array
//         char[] ch2 = guess.toCharArray();
//         boolean[] freq = new boolean[ch1.length];

//         for(int i=0;i<ch1.length;i++){    //checking for x value --> number of bulls
//             if(ch1[i] == ch2[i]){
//                 x++;   freq[i]=true;
//             }  
//         }

//         // creating arrayList to store the values of char2 for comparison of existance
//         ArrayList<Character> l1 = new ArrayList<>();
//         for(int i=0;i<ch1.length;i++)  l1.add(ch2[i]);

//         // System.out.println(l1);
// //checking for y values --> cows --> such that guess string contains the value but not placed at correct index as secret
//         for(int i=0;i<ch1.length;i++){   
//             if(ch1[i] != ch2[i] && l1.contains(ch1[i])){
//                 int j = l1.indexOf(ch1[i]);
//                 System.out.println(l1.indexOf(ch1[i])+" "+i+" "+j+" "+freq[j]);
//                 if(freq[j] == false)  y++;
//             } 
//         }
//         return ""+x+"A"+y+"B";
//     }
// }