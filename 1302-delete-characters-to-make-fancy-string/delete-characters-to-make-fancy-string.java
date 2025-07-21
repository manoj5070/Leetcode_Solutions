class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        if(n<3) return s;
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        int j=2;
        for(int i=2;i<n;i++){
            if(sb.charAt(j-1)==s.charAt(i) && sb.charAt(j-2)==s.charAt(i)){
                continue;
            }else{
                sb.append(s.charAt(i));
                j++;
            }
        }
        return sb.toString();
    }
}