class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       if(n<2) return s;
       String str="";
       for(int i=0;i<n;i++){
        int j=n-1;
        while(j>=i){
            char ch=s.charAt(i);
            char bh=s.charAt(j);
            if(ch==bh){
                String check=s.substring(i,j+1);
                if(checkPalindrome(check)){
                    if(str.length()<check.length()){
                        str=check;
                    }
                }
            }
            j--;
        }
       } 
       return str;
    }
    public boolean checkPalindrome(String check){
        int right=check.length()-1;
        int left=0;
        while(left<right){
            char ch=check.charAt(left);
            char bh=check.charAt(right);
            if(ch!=bh) return false;
            left++;
            right--;
        }
        return true;
    }
}