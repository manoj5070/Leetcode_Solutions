class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                int j=i-k;
                while(j<0) j++;
                while(j<n && j<=i+k){
                    set.add(j);
                    j++;
                }
            }
        }
        System.out.print(set);
        List<Integer> ls=new ArrayList<>();
        for(int num:set){
            ls.add(num);
        }
        Collections.sort(ls);
        return ls;
    }
}