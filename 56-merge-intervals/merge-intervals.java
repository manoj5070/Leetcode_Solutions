class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> ls=new ArrayList<>();
        Comparator<int[]> com=new Comparator<>(){
            public int compare(int[] a,int[] b){
                if(a[0]>b[0]) return 1;
                else if(a[0]<b[0]) return -1;
                else{
                    if(a[1]>b[1]) return 1;
                    else if(a[1]<b[1]) return -1;
                    else return 0;
                } 
            }
        };
        Arrays.sort(intervals,com);
     
        int n=intervals.length;

        ls.add(intervals[0][0]);
        int pre=intervals[0][1];

        for(int i=1;i<n;i++){
            int f=intervals[i][0];
            int s=intervals[i][1];
            if(pre>=f){
                if(pre>=s) continue;
                else pre=s;
                if(i==n-1) break;
            }else{
                ls.add(pre);
                ls.add(f);
                pre=s;
            } 
        }
        if(ls.size()%2!=0) ls.add(pre);

         n=ls.size();

        int[][] ans=new int[n/2][2];

        int k=0;
        for(int i=0;i<n;i+=2){
            ans[k][0]=ls.get(i);
            ans[k][1]=ls.get(i+1);
            k++;
        }

        return ans;
    }
}