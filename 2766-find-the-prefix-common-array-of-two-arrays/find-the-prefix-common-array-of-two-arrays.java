class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freArr=new int[n+1];
        int[] ans=new int[n];
        int step=0;
        for(int i=0;i<n;i++){
            freArr[A[i]]++;
            freArr[B[i]]++;
            if(freArr[A[i]]==2) step++;
            if(A[i]!=B[i] && freArr[B[i]]==2) step++;
            ans[i]=step;
            
        }
        return ans;
    }
}