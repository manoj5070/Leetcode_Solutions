class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int sum=0;
        int n=num;
        while(true){
            while(n>0){
                sum=sum+n%10;
                n/=10;
            }
            if(sum<10) return sum;
            n=sum;
            sum=0;
        }
    }
}