class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
       int sum=0;
       int n=startTime.length;
       List<Integer> ls=new ArrayList<>();
       ls.add(startTime[0]);
       for(int i=1;i<n;i++){
        ls.add(startTime[i]-endTime[i-1]);
       } 
       ls.add((eventTime-endTime[n-1]));
       if (ls.size() <= k) {
            int total = 0;
            for (int val : ls) total += val;
            return total;
        }
       for(int i=0;i<=k;i++){
        sum+=ls.get(i);
       }
       int temp=sum;
       for(int i=k+1;i<ls.size();i++){
            temp=temp-ls.get(i-k-1)+ls.get(i);
            sum=Math.max(sum,temp);
       }
       return sum;
    }
}