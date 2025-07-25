class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            int c=0;
            int temp=i;
            while(temp>1){
                int rem=temp%2;
                if(rem==1) c++;
                temp/=2;
            }
            arr[i]=c+1;
        }
        return arr;
    }
}