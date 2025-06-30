class Solution {
    public int findLHS(int[] nums) {
      int count=0;
      int n=nums.length;
     Map<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     }
     System.out.print(map);
     for(int i=0;i<n;i++){
        int min=map.get(nums[i]);
        if(map.get(nums[i]+1)==null) continue;
        int max=map.get(nums[i]+1);
        count=Math.max(count,min+max);
     }
      return count;
    }
}