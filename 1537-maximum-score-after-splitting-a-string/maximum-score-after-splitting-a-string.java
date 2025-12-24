class Solution {
    public int maxScore(String s) {
       int n=s.length();
       int oneSum=0; 
       int zeroSum=0; 
       for(char c:s.toCharArray()){
        if(c-'0'==0) zeroSum++;
        else oneSum++;
       }
    //    System.out.print(oneSum);
    //    System.out.print(zeroSum);
    //    if(zeroSum==0 || oneSum==0) return n-1;
       int one=0;
       int zero=0;
       int max=-1;
       for(char c:s.toCharArray()){
        if(c-'0'==0) zero++;
        else one++;
        max=Math.max(max,(oneSum-one+zero));
        if(one==oneSum) break;
       }
       max=Math.max(max,zeroSum-1);
       return max;
    }
}