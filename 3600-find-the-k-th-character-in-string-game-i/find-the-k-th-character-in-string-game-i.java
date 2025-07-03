class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder();
        sb.append('a');
        while(sb.length()<k){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='z') s.append('a');
            else{
                char c=sb.charAt(i);
                c++;
                s.append(c);
            } 
        }
            sb.append(s);
        }
        return sb.charAt(k-1);
    }
}