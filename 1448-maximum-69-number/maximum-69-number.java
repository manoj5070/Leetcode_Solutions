class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder(String.valueOf(num));

        int i=0;
        int n=sb.length();
        while(i<n){
            if(sb.charAt(i)=='6') break;
            i++;
        }
        if(i==n) return num;

        sb.setCharAt(i,'9');
        System.out.print(sb.toString());
        return Integer.valueOf(sb.toString());
    }
}