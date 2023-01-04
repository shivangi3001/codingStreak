// daily leetcode challenge --> 4th Jan2023

class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer>hm = new HashMap<>();
        int c=0;
        for(int i : tasks){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        System.out.println(hm);
        
        for(int i : hm.keySet()){
            if(hm.get(i) == 1)  return -1;
            c += (hm.get(i)+2)/3;
        }


        return c;
    }
}


// class Solution {
//     public int minimumRounds(int[] tasks) {
//         int len = tasks.length;
//         if(len<2) return -1;
//         Arrays.sort(tasks);

//         int n = tasks[len-1];

//         int[] arr = new int[n+1];
//         for(int i=0;i<len;i++){
//             // if(tasks[i]<10) {
//                 arr[tasks[i]]++;
//             // }
//         }

//         // for(int i=0;i<10;i++)   System.out.print(arr[i]+" ");
//         // System.out.println();

//         int c=0;
//         for(int i=0;i<tasks.length;i++){
//             // System.out.println(i+" "+tasks[i]+" "+arr[tasks[i]]+" "+c);
//             int a = arr[tasks[i]];
//             if(a>=3){  arr[tasks[i]] = a-3;  c++; i=i+2; }
//             else if(a==2) {  arr[tasks[i]]=a-2;   c++;  i=i+1; }
//             else      return -1;
//         }
//         return c;
//     }
// }