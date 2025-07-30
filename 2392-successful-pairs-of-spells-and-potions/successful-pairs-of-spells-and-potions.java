class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int n=spells.length;
        int m=potions.length;
    
        int[] arr=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            int j=0;
            int k=m-1;

            while(j<k){
                int mid=j+(k-j)/2;
                if(((long)potions[mid]*(long)(spells[i]))<success) j=mid+1;
                else k=mid-1;
            }
            if(((long)potions[j]*(long)(spells[i]))<success) arr[a++]=m-j-1;
            else arr[a++]=m-j;
        }
        return arr;
    }
}