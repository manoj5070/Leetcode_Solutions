class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i=0;
       int j=0;
       int n=word1.length(); 
       int m=word2.length(); 
       StringBuilder sb=new StringBuilder();
       while(i<n && j<m){
        sb.append(word1.charAt(i));
        sb.append(word2.charAt(j));
        i++;
        j++;
       }
       if(i!=n) sb.append(word1.substring(i,n));
       else sb.append(word2.substring(j,m));
       return sb.toString();
    }
}