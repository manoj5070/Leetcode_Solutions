class Solution {
    public int totalFruit(int[] fruits) {
      Map<Integer,Integer> map=new HashMap<>();
      int max=-1;
      int i=0;
      int n=fruits.length;
      int j=0;

    
      while(j<n){
        if(!map.containsKey(fruits[j]) && map.size()==2){
             max=Math.max(max,j-i);
            while(i<n){
                    map.put(fruits[i],map.get(fruits[i])-1);
                    if(map.get(fruits[i])==0){
                         map.remove(fruits[i]);
                         i++;
                         break;
                    }
                    i++;
                    
            }
             map.put(fruits[j],1);
             j++;
        }else{
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            j++;
             max=Math.max(max,j-i);
        }
      }  
      return max;
    }
}