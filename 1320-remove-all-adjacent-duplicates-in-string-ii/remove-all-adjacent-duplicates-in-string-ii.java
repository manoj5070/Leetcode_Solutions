class pair{
    char ch;
    int freq;
    public pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair> st=new Stack<>();
        for(char newCh:s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch==newCh){
                if(st.peek().freq==k-1) while(!st.isEmpty() && newCh==st.peek().ch) st.pop();
                else{
                    st.push(new pair(newCh,st.peek().freq+1));
                }
            }
            else{
                st.push(new pair(newCh,1));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek().ch);
            st.pop();
        }
        return sb.reverse().toString();
    }
}