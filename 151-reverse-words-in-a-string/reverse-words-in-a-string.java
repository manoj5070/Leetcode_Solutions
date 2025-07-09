class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        Stack<String> st=new Stack<>();
        int j=0;
        int i=j;
        while(j<s.length()){
            j=i;
            while(j<s.length() && s.charAt(j)!=' ') j++;
                st.push(s.substring(i,j));
             while(j<s.length() && s.charAt(j)==' ') j++;
                i=j;
        }

        StringBuilder s1=new StringBuilder();
        while(!st.isEmpty()){
            s1.append(st.pop());
            if(!st.isEmpty()) s1.append(' ');
        }
       return s1.toString();
    }
}