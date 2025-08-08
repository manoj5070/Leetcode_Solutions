class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();

        Set<String> st=new HashSet<>();


        for(int i=0;i<n-k+1;i++){
            st.add(s.substring(i,k+i));
        }
        int size=(int)Math.pow(2,k);
        if(st.size()==size) return true;
        return false;
    }
}