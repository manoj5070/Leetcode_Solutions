class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max=-1;
       int n=candies.length;
       for(int i=0;i<n;i++){
       max=Math.max(max,candies[i]);
       }
       List<Boolean> ls=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(candies[i]+extraCandies>=max) ls.add(true);
        else ls.add(false);
       }
       return ls;
    }
}