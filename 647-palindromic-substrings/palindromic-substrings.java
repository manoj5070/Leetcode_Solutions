class Solution {
    public int countSubstrings(String s) {
      int count=0;
      int n=s.length();
      StringBuilder sb=new StringBuilder(s);
      for(int i=0;i<n;i++){
       for(int j=i+1;j<=n;j++) {
            if(isPal(sb.substring(i,j))){
                count++;
            }
       }
      } 
      return count; 
    }
    private boolean isPal(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}