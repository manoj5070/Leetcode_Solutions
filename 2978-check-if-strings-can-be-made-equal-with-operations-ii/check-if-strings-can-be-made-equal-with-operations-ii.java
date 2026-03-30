class Solution {
    public boolean checkStrings(String s1, String s2) {
       int []even1=new int[26]; 
       int []odd1=new int[26]; 
       int []even2=new int[26]; 
       int []odd2=new int[26]; 
       int n=s1.length();
       for(int i=0;i<n;i+=2){
        even1[s1.charAt(i)-'a']++;
        if(i+1<n) odd1[s1.charAt(i+1)-'a']++;
       }
       for(int i=0;i<n;i+=2){
        even2[s2.charAt(i)-'a']++;
        if(i+1<n) odd2[s2.charAt(i+1)-'a']++;
       }
       for(int i=0;i<26;i++){
        if(odd1[i]!=odd2[i]) return false;
       }
       for(int i=0;i<26;i++){
        if(even1[i]!=even2[i]) return false;
       }
       return true;
    }
}