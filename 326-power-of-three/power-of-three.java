class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        return rec(n);
    }
    private boolean rec(int n){
        if(n==1) return true;
        else if(n%3!=0) return false;
        return rec(n/3);
    }
}