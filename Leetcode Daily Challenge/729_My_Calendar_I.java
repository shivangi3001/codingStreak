// testcases
// Testcase1 - ["MyCalendar","book","book","book"]
// [[],[10,20],[15,25],[20,30]]

//Testcase2 ["MyCalendar","book","book","book","book","book","book","book","book","book","book"]
// [[],[47,50],[33,41],[39,45],[33,42],[25,32],[26,35],[19,25],[3,8],[8,13],[18,27]]
// ["MyCalendar","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book","book"]
// [[],[97,100],[33,51],[89,100],[83,100],[75,92],[76,95],[19,30],[53,63],[8,23],[18,37],[87,100],[83,100],[54,67],[35,48],[58,75],[70,89],[13,32],[44,63],[51,62],[2,15]]

// output 
// [null,true,false,true]
// [null,true,true,false,false,true,false,true,true,true,false]
// [null,true,true,false,false,true,false,true,true,false,false,false,false,false,false,false,false,false,false,false,true]

class MyCalendar {
    List<int[]> bookings;
    
    public MyCalendar() {
        bookings= new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
//         int[] arr = new int[2];  boolean flag = false;
//         arr[0] = start;    arr[1] = end;
//         if(bookings.size() == 0){
//             bookings.add(arr);
//             return true;
//         }
//         //boolean flag = false;
//         System.out.println(bookings.size()+"->");
//         // for(int i=0;i<bookings.size();i++){
//         //    int[] j = bookings.get(i); 
//         //    if(j[0]>=end)          flag=true;
//         //    else if(j[1]<=start)  flag =true;
//         //    else             flag=false;
//         //     bookings.add(arr);
//         // }
        
//         for(int[] i: bookings){
//             System.out.println("i[0,1]->"+i[0]+"->"+i[1]+"->"+bookings);
//             //bookings.add(i);
            
//             if(i[1]<=start) flag =  true;
//             else if(end<=i[0]) flag= true;
//             else{
//                 flag= false;
//             }
//             bookings.add(arr);
//             // else if(end<i[0])
//         }
//         return flag;
        int arr[] = new int[]{start, end};
        for(int[] i : bookings){
            // if(start>=i[0] && start<i[1])  return false;
            // else if(end>i[0] && end<=i[1])  return false;
            if(start<i[1] && end>i[0]) return false;
        }
        bookings.add(arr);
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */