class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        return recu(n);
    }
    private boolean recu(int n){
        if(n==1) return true;
        else if(n%2!=0) return false;
        return recu(n/2);
    }
}