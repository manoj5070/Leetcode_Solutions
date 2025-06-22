class Solution {
    public String[] divideString(String s, int k, char fill) {
       StringBuilder sb=new StringBuilder(s);
       int n=s.length();
        while(n%k!=0){
            sb.append(fill);
            n++;
        } 
        int j=0;
        String[] str=new String[n/k];
        for(int i=0;i<n;i+=k){
            str[j++]=sb.substring(i,i+k);
        }
        return str;
    }
}