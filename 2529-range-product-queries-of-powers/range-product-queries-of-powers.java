class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> ls=new ArrayList<>();
        int ind=1;
        int M=1000000007;
        while(n>0){
            if(n%2!=0) ls.add(ind);
            n/=2;
            ind*=2;
        }
        int m=queries.length;
        int[] arr=new int[m];

        for(int i=0;i<m;i++){
            int j=queries[i][0];
            int k=queries[i][1];
            long mul=1;
            for(int a=j;a<=k;a++){
                mul=(mul*ls.get(a))%M;
            }
            arr[i]=(int)mul;
        }
        return arr;
    }
}