class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        int j=1;
        // if(n==1) return 1;
        long sum=1;
        for(int i=1;i<n;i++){
            if(prices[i-1]-prices[i]==1){
                j++;
            }else j=1;
            sum+=j;
        }
        return sum;
    }
}