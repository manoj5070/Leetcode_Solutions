class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->b[1]-b[0]-(a[1]-a[0]));
        int ans=0;
       int l=0;
       int r=Integer.MAX_VALUE;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(isPossible(tasks,mid)){
            ans=mid;
            r=mid-1;
        }else{
            l=mid+1;
        }
       }
        return ans;
    }
    public boolean isPossible(int[][] tasks,int value){
        int n=tasks.length;
        for(int i=0;i<n;i++){
            if(tasks[i][1]>value) return false;
            value-=tasks[i][0];
        }
        return true;
    }
}