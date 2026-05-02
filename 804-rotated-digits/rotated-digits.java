class Solution {
    public int rotatedDigits(int n) {
        Set<Integer> set=Set.of(3,4,7);
        Set<Integer> set1=Set.of(2,5,6,9);
        int count=0;
        for(int i=1;i<=n;i++){
            int num=i;
            boolean check=false;
            while(num>0){
                int rem=num%10;
                if(set.contains(rem)){
                    check=false;
                    break;
                } 
                if(set1.contains(rem)) check=true;
                num/=10;
            }
            if(check) count++;
        }
        return count;
    }
}