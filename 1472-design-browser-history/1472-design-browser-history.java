// leetcode daily challenge - 18th March 2023
// Runtime: 59 ms        Beats: 54.85%

// used doubly linkedlist approach
class Node{
    Node prev,next;
    String url;

    Node(String url){
        this.url = url;
    }
}

class BrowserHistory {
    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node temp = new Node(url);
        curr.next = temp;
        temp.prev = curr;
        curr = curr.next;
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(curr.prev == null)  break;
            curr=curr.prev;
        } 
        return curr.url;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(curr.next == null)  break;
            curr=curr.next;
        }
        return curr.url;
    }
}


// for this code 11/72 testcases passed

// failed testcase -> 
// ["BrowserHistory","forward","forward","visit","visit","back","visit","visit","visit","visit","visit","forward","visit","back","visit","visit","forward","visit","back","visit","forward","visit","back","back","visit","visit","back","visit","back","visit","visit","visit","back","back","forward","visit"]
// [["spzn.com"],[6],[3],["yglghy.com"],["bdsrnfr.com"],[5],["ei.com"],["expmyxq.com"],["ue.com"],["thkhs.com"],["laoy.com"],[6],["fdzqi.com"],[3],["wdh.com"],["nsxsf.com"],[9],["pqeqm.com"],[4],["yyfhv.com"],[3],["tvidl.com"],[8],[9],["ifn.com"],["fqaock.com"],[7],["ow.com"],[1],["fdg.com"],["xsub.com"],["cxmc.com"],[3],[7],[10],["omsh.com"]]
// class BrowserHistory {
//     Stack<String> st = new Stack<>();
//     Stack<String> st1;

//     public BrowserHistory(String homepage) {
//         st.push(homepage);
//     }
    
//     public void visit(String url) {
//         st1=new Stack<>();
//         st.push(url);
//     }
    
//     public String back(int steps) {

//         if(st.size() > steps ){
//             for(int i=0;i<steps;i++){
//                 String str = st.pop();
//                 st1.push(str);
//             }
//             return st.peek();
//         }
//         while(st.size() != 1){
//             String str = st.pop();    st1.push(str);
//         }
//         return st.peek();
//     }
    
//     public String forward(int steps) {
//         if(st1.size() - steps < 0){
//             while(st1.size() != 0){
//                 String str = st1.pop();    st.push(str);
//             }
//             return st.peek();
//         }
//         for(int i=0;i<steps;i++){
//             String str = st1.pop();    st.push(str);
//         }
//         return st.peek();
//     }
// }


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */