class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
    List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
       entryList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int[] arr=new int[k];
        int i=0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            arr[i++]=entry.getKey();
            if(i==k) return arr;
        }
        return arr;
    }
}