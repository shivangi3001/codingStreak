// leetcode daily challenge - 12th april

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] p = path.split("/");
        for (int i = 0; i < p.length; i++) {
            if (!stack.empty() && p[i].equals(".."))
                stack.pop();
            else if (!p[i].equals(".") && !p[i].equals("") && !p[i].equals(".."))
                stack.push(p[i]);
        }
        List<String> list = new ArrayList(stack);
        return "/"+String.join("/", list);
    }
}

// 40 / 258 testcases passed
// class Solution {
//     public String simplifyPath(String path) {
//         int len = path.length();

//         if(len == 1)  return path;

//         Stack<Character> st = new Stack<>();
//         StringBuilder sb = new StringBuilder();

//         st.push(path.charAt(0));
//         for(int i=1;i<len;i++){
//             char ch = path.charAt(i);
//             if(i==len-1 && ch=='/')  continue;
//             if(st.peek() == '/'){
//                 if(ch == '/' || ch=='.' ) continue;
//                 else{
//                     st.push(ch);
//                     continue;
//                 }
//             }
//             else if(ch != '.') st.push(ch);
//         }

//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
//         sb.reverse();

//         return sb.toString();
//     }
// }

// "/a/./b/../../c/"