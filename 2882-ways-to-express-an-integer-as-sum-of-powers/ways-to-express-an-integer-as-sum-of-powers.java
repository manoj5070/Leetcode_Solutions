class Solution {
    int[][] memo=new int[301][301]; 
    public int numberOfWays(int n, int x) {
        for(int i=1;i<=300;i++){
             Arrays.fill(memo[i],-1);
        }
        return solve(n,1,x);
    }
    public int solve(int n,int ind,int x){
        if(n==0) return 1;
        if(Math.pow(ind,x)>n || n<0) return 0;
        if(memo[n][ind]!=-1) return memo[n][ind];
        int pick=solve(n-(int)(Math.pow(ind,x)),ind+1,x);
        int notpick=solve(n,ind+1,x);
        return memo[n][ind]=((pick%1000000007)+(notpick%1000000007))%1000000007;
    }
}