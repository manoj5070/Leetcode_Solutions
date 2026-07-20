class Solution {
    public boolean isAnagram(String s, String t) {
       int[] charT=new int[26];
       if(s.length()!=t.length()) return false;
       for(int i=0;i<s.length();i++){
        charT[s.charAt(i)-'a']++;
        charT[t.charAt(i)-'a']--;
       } 
        for(int num:charT) if(num!=0) return false;
        return true;
    }
}