class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) str.append(ch);
        }
        String s2=str.toString().toLowerCase();
        String s1=str.reverse().toString().toLowerCase();
        System.out.println(s1);
        System.out.print(s2);
        return s1.equals(s2);
    }
}