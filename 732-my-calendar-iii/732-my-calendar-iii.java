class MyCalendarThree {
    TreeMap<Integer, Integer> tmap;
    
    public MyCalendarThree() {
        tmap = new TreeMap<>();    
    }
    
    public int book(int start, int end) {
        tmap.put(start, tmap.getOrDefault(start, 0)+1);
        tmap.put(end, tmap.getOrDefault(end, 0)-1);
        
        int activeBook = 0;
        int maxActiveBook = 0;
        for(int i : tmap.values()){
            activeBook += i;
            maxActiveBook = Math.max(activeBook, maxActiveBook);
        }
        return maxActiveBook;
    }
}


// my approach failed for this testcase
// i/p--> ["MyCalendarThree","book","book","book","book","book","book","book","book","book","book"]
// [[],[24,40],[43,50],[27,43],[5,21],[30,40],[14,29],[3,19],[3,14],[25,39],[6,19]]


// class MyCalendarThree {
//     List<int[]> cal ;
//     int k=1;
    
//     public MyCalendarThree() {
//         cal = new ArrayList<>();
//     }
    
//     public int book(int start, int end) {
//         int[] arr = new int[]{start, end};
        
//         for(int[] i : cal){
//             if(start<i[1]  && end>i[0]){
//                 if(k<3) k++;
//                 break;
//             }
//         }
//         cal.add(arr);
//         return k;
//     }
// }

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */