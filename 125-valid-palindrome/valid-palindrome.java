class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        if(n<=1) return true;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')) sb.append(ch);
        }
        String str2=sb.toString();
        String str=sb.reverse().toString();
        // String str1=str.toLowerCase();
        System.out.print(str);
        System.out.print(str2);
        return str2.toLowerCase().equals(str.toLowerCase());
    }
}