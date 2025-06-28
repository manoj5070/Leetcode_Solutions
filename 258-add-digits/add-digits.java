class Solution {
    public int addDigits(int num) {
       if(num/10==0) return num;
       int digit=0;
       while(true){
        while(num>0){
            digit+=num%10;
            num/=10;
        }
        if(digit<10) return digit;
        num=digit;
        digit=0;
       } 
    }
}