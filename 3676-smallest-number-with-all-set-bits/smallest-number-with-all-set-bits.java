class Solution {
    public int smallestNumber(int n) {
        int ans=1;
        while(ans<=n){
            ans*=2;
        }
        return n==1?1:ans-1;
    }
}