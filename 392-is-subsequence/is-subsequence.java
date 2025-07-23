class Solution {
    public boolean isSubsequence(String s, String t) {
       Stack<Character> st=new Stack<>();
       for(char ch:s.toCharArray()) st.push(ch);

       for(int i=t.length()-1;i>=0;i--){
        if(st.isEmpty()) return true;
        if(t.charAt(i)==st.peek()) st.pop();
       }
        if(st.isEmpty()) return true;
        return false;
    }
}