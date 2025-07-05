class Solution {
    public int findLucky(int[] arr) {
        int[] ans=new int[501];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
        }
        int temp=-1;
        for(int i=1;i<ans.length;i++){
            if(ans[i]==i)  temp=i;
        }
        return temp;
    }
}