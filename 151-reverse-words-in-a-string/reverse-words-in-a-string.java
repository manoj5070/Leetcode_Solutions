class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s.trim());
        Stack<String> st=new Stack<>();
        int j=0;
        int i=j;
        while(j<sb.length()){
            j=i;
            while(j<sb.length() && sb.charAt(j)!=' ') j++;
                st.push(sb.substring(i,j));
             while(j<sb.length() && sb.charAt(j)==' ') j++;
                i=j;
        }

        StringBuilder sb1=new StringBuilder();
        while(!st.isEmpty()){
            sb1.append(st.pop());
            if(!st.isEmpty()) sb1.append(' ');
        }
       return sb1.toString();
    }
}