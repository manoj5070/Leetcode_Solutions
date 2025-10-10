class Solution {
    public int maximumEnergy(int[] energy, int k) {
     int max=Integer.MIN_VALUE;
     int n=energy.length;
     int[] dp=new int[n];
     Arrays.fill(dp,Integer.MIN_VALUE);
     for(int i=0;i<n;i++){
        max=Math.max(max,solve(energy,i,k,dp));
     }
     return max;
    }
    public int solve(int[] en,int i,int k,int[] dp){
        if(i>=en.length) return 0;
        if(dp[i]!=Integer.MIN_VALUE) return dp[i];
        return dp[i]=en[i]+solve(en,i+k,k,dp);
    } 
}