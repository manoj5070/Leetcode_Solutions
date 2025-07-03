class Solution {
    public char kthCharacter(int k) {
        String str="a";
        return rec(str,k);
    }
    public char rec(String s,int k){
        if(s.length()>=k) return s.charAt(k-1);
        int index=0;
        StringBuilder sb=new StringBuilder(s);
        while(index<s.length()){
            char ch=s.charAt(index);
            ch++;
            sb.append(ch);
            index++;
        }
        return rec(sb.toString(),k);
    }
}