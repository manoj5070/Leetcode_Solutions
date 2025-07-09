class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        while(i<s.length()){
            for(int j=0;j<t.length();j++){
                if(t.charAt(j)==s.charAt(i)) i++;
                if(i==s.length()) break;
            }
            break;
            
        }
        return i==s.length();
    }
}