class Solution {
    public String largestGoodInteger(String num) {
        int n=-1;
        for(int i=0;i<=num.length()-3;i++){
            boolean check=true;
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)){
                int sum=Integer.valueOf(num.substring(i,i+3));
                if(n<(sum%10)){
                    n=sum%10;
                }
            }
        }
        if(n==-1) return "";
        return (n+""+n+""+n);
    }
}