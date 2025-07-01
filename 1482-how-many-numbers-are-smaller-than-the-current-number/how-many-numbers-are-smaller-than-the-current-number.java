class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] num=nums.clone();
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[n];
        for(int i=n-1;i>=1;i--){
            int j=i-1;
            while(j>=0 && nums[j]==nums[i]){
                j--;
            }
            if(j<0) map.put(nums[i],0);
            else map.put(nums[i],j+1);
        } 
        for(int i=0;i<n;i++){
            int j=num[i];
            arr[i]=map.getOrDefault(j,0);
        }
        return arr;
    }
}