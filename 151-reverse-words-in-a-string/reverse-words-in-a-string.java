class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s.trim());
        Stack<String> st=new Stack<>();
        int j=0;
        int i=j;
        while(j<sb.length()){
            if(sb.charAt(j)==' '){
                st.push(sb.substring(i,j));
                while(sb.charAt(j)==' ') j++;
                i=j;
            }else j++;

            if(j==sb.length()){
                st.push(sb.substring(i,j));
            }
        }

        StringBuilder sb1=new StringBuilder();
        while(!st.isEmpty()){
            sb1.append(st.pop());
            sb1.append(' ');
        }
       return sb1.toString().trim();
    }
}