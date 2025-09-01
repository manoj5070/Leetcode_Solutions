class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=flowerbed.length;
        
        // if(k>1 && flowerbed[i]==0 flowerbed[i+1]==0){
        //     flowerbed[i]=1;
        //     n--;
        // }
        for(int i=0;i<k;i++){
            boolean check1=true;
            boolean check2=true;
            if(flowerbed[i]==0){
            if(n==0) return true;
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