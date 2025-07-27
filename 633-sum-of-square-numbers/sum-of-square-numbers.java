class Solution {
    public boolean judgeSquareSum(int c) {
       int i=0;
       long j=(long)(Math.sqrt(c));
       while(i<=j){
        long num=(i*i)+(j*j);
        if(num==c) return true;
        if(num<c) i++;
        else j--;
       } 
       return false;
    }
}