class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) {
       int m=bed.length;
       int i=1;
       if(m>1){
        if(bed[0]==0 && bed[1]==0){
            bed[0]=1;
            n--;
        }
       }
       if(m==1 && bed[0]==0 && n<2) return true; 
       while(i<m){
        if(i==m-1 && bed[i]==0 && bed[i-1]==0){
            i++;
            n--;
        }
        else if(i<m-1 && bed[i]==0 && bed[i-1]==0 && bed[i+1]==0){
            bed[i]=1;
            n--;
            i++;
        }else i++;
       }
       return n<=0;
    }
}