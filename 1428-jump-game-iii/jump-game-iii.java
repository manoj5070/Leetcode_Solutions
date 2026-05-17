class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
       boolean ans=isPossible(arr,start,n);
       return ans;
    }
    public boolean isPossible(int[] arr,int start,int n){
        System.out.print(start+" ");
        if(start>n-1 || start<0 || arr[start]==-1) return false;
        if(arr[start]==0) return true;
        int jump=arr[start];
        arr[start]=-1;
        return (isPossible(arr,start+jump,n)||isPossible(arr,start-jump,n));
    }
}