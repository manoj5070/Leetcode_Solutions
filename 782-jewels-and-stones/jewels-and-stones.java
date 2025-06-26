class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length();
        int m=stones.length();
       int[] jew=new int[125]; 
       int[] sto=new int[125]; 
        for(int i=0;i<n;i++){
            char ch=jewels.charAt(i);
            jew[ch]++;
        }
        for(int i=0;i<m;i++){
            char ch=stones.charAt(i);
            sto[ch]++;
        }
        int count=0;
        for(int i=0;i<125;i++){
            count+=(jew[i]*sto[i]);
        }
        return count;
    }
}