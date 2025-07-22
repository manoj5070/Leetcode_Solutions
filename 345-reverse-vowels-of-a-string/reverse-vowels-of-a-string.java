class Solution {
    public String reverseVowels(String s) {
        Set<Character> st=new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(i<j){
            if(st.contains(sb.charAt(i))){
                if(st.contains(sb.charAt(j))){
                char ch=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,ch);
                j--;
                }else{
                    while(j>i && !st.contains(sb.charAt(j))) j--;
                    if(j<=i) break;
                    char ch=sb.charAt(i);
                    sb.setCharAt(i,sb.charAt(j));
                    sb.setCharAt(j,ch);
                    j--;
                }
            }
            i++;
        }
            // System.out.print(st);
        return sb.toString();
    }
}