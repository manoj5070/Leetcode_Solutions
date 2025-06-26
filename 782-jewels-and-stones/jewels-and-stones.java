class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length();
        int m=stones.length();
       int[] jew=new int[125]; 
       int[] sto=new int[125]; 
        for(char ch:jewels.toCharArray()){
                    jew[ch]++;
        }
        for(char ch:stones.toCharArray()){
                    sto[ch]++;
        }
        int count=0;
        for(int i=0;i<125;i++){
            count+=(jew[i]*sto[i]);
        }
        return count;
    }
}