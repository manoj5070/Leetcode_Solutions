class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=flowerbed.length;
            if(n==0) return true;
        
         if(k>1 && flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        for(int i=0;i<k;i++){
            boolean check1=true;
            boolean check2=true;
            if(n==0) return true;
            if(flowerbed[i]==0){
                if(i+1<k){
                    if(flowerbed[i+1]==1) check1=false;
                }
                if(i>0){
                    if(flowerbed[i-1]==1) check2=false;
                }
                if(check1 && check2){
                    flowerbed[i]=1;
                    n--;
                }
            }
        }
        return n==0; 
    }
}