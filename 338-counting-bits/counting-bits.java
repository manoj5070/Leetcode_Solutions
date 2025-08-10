class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            int c=0;
            int temp=i;
            while(temp>1){
                if((temp&1)==1) c++;
                temp>>=1;
            }
            arr[i]=c+1;
        }
        return arr;
    }
}
