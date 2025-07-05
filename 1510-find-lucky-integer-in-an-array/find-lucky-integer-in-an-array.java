class Solution {
    public int findLucky(int[] arr) {
        int[] ans=new int[501];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
        }
        int temp=-1;
        for(int i=500;i>=1;i--){
            if(ans[i]==i) return temp=i;
        }
        return -1;
    }
}