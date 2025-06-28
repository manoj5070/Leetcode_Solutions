class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        int n=columnTitle.length();
        for(int i=n-1;i>=0;i--){
            sum+=(columnTitle.charAt(i)-'A'+1)*(int)Math.pow(26,n-i-1);
       }
        return sum;
    }
}