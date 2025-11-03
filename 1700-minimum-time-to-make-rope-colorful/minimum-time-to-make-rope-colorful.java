class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans=0;
        int n=colors.length();
        int i=1;

        while(i<n){
            char c=colors.charAt(i);
            int j=i-1;
            if(colors.charAt(i)==colors.charAt(i-1)){
                while(i<n && colors.charAt(i)==c){
                    i++;
                }
                int max=-1;
                int sum=0;
                for(int k=j;k<i;k++){
                    sum+=neededTime[k];
                    max=Math.max(max,neededTime[k]);
                    System.out.print(max);
                    System.out.print(sum);
                }
                ans+=(sum-max);
            }
            i++;
        }
        return ans;
    }
}