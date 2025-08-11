class Solution {
    public boolean reorderedPowerOf2(int n) {
        String str=reverse(n);

        for(int i=0;i<=29;i++){
            int pow=1<<i;
            String s=reverse(pow);
            if(s.equals(str)) return true;
        }
        return false;
    }
        public String reverse(int a){
            String str1=String.valueOf(a);
            StringBuilder sb=new StringBuilder();
            StringBuilder str=new StringBuilder(str1);
            for(int i=0;i<str1.length();i++){
                char c=str.charAt(i);
                int ind=-1;
                for(int j=0;j<str1.length();j++){
                    if(c>=str.charAt(j) && str.charAt(j)!='a'){
                        c=str.charAt(j);
                        ind=j;
                    }
                }
                if(ind==-1) continue;
                str.setCharAt(ind,'a');
                sb.append(c);
            }
            // System.out.print(sb.toString()+" ");
        return sb.toString();
        }
}