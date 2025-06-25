class Solution {
    public int reverse(int x) {
        int minus=Math.abs(x);
        long num=0;

        while(minus>0){
            num=num*10+minus%10;
            minus/=10;
        }
        if(Math.abs(num)>(long)2147483647) return 0;
        return x<0?-(int)num:(int)num;
    }
}