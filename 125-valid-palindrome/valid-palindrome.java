class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb=new StringBuilder();

       for(char c:s.toCharArray()){
        if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9')){
            sb.append(c);
        }
       } 
       String str=sb.toString().toLowerCase();
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