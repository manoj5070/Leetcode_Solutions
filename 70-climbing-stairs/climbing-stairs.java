class Solution {
      static int[] dp=new int[46];
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        dp[1]=1;
        dp[2]=2;
       return fibo(n);
    }
    private int fibo(int n){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibo(n-1)+fibo(n-2);
    }

}