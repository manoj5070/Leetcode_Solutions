class Solution {
    public int maxProduct(int n) {
        List<Integer> ls=new ArrayList<>();
        int m=n;
        while(m>0){
            ls.add(m%10);
            m/=10;
        }
        Collections.sort(ls);
        return ls.get(ls.size()-1)*ls.get(ls.size()-2);
    }
}