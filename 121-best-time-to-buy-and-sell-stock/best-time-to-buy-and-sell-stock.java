class Solution {
    public int maxProfit(int[] prices) {
       int curr=0;
       int max=0;
       for(int i=1;i<prices.length;i++){
        if(prices[curr]>prices[i]){
            curr=i;
        }else{
            max=Math.max(max,prices[i]-prices[curr]);
        }
       }
       return max;
    }
}