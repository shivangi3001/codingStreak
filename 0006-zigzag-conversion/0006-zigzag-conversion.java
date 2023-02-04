class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        int len = s.length();
        // List<List<Integer>> l1 = new ArrayList<>();
        // for(int i=0;i<numRows;i++)  l1.add(new ArrayList<>());
        StringBuilder str = new StringBuilder();

        int k = 2*(numRows-1);
        for(int i=0;i<numRows;i++){
            int idx=i;
            while(idx<len){
                str.append(s.charAt(idx));
                if( i!=0 && i!=numRows-1){
                    int k1 = k-(2*i);
                    int k2 = idx+k1;
                    if(k2<len)  str.append(s.charAt(k2));
                }
                idx=idx+k;
            }
        }
        return str.toString();
    }
}