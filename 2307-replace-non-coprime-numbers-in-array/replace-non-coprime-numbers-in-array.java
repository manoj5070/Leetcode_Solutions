class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ls=new ArrayList<>();


        for(int i=0;i<nums.length;i++){
            
            ls.add(nums[i]);
            
            while(ls.size()>1){
            int n=ls.size();
            int num1=ls.get(n-1);
            int num2=ls.get(n-2);
            int gcd=gcdTo(num1,num2);

            if(gcd>1){
                int lcm=(int)(((long)num1*(long)num2)/gcd);
                ls.remove(n-1);
                ls.remove(n-2);
                ls.add(lcm);
            }else break;
            }
        }
        
        return ls;
    }
    public int gcdTo(int a,int b){
        if(b==0) return a;
        return gcdTo(b,a%b);
    }
}