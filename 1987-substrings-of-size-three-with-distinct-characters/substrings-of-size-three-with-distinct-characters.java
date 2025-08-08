class Solution {
    public int countGoodSubstrings(String s) {
       int c=0;
       int n=s.length();

       for(int i=0;i<n-2;i++){
        Set<Character> st=new HashSet<>();
        st.add(s.charAt(i));
        st.add(s.charAt(i+1));
        st.add(s.charAt(i+2));
        if(st.size()==3) c++;
       } 
       return c;
    }
}