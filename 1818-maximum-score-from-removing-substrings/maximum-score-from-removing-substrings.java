class Solution {
    public int maximumGain(String s, int x, int y) {
        int max=0;
        int min=0;
        String maxString="";
        String minString="";
        if(x<y){
            maxString="ba";
            max=y;
            minString="ab";
            min=x;
        }else{
             maxString="ab";
            max=x;
            minString="ba";
            min=y;
        }
        int total=0;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==maxString.charAt(1) && st.peek()==maxString.charAt(0)){
                st.pop();
            }else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        total+=((s.length()-sb.length())/2)*max;
        st.clear();
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(!st.isEmpty() && ch==minString.charAt(1) && st.peek()==minString.charAt(0)){
                st.pop();
            }else st.push(ch);
        }
         
        total+=((sb.length()-st.size())/2)*min;
        return total;
    }
}