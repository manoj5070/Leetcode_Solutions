class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        List<Integer> ls1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key) ls1.add(i);
        }
        for(int i=0;i<ls1.size();i++){
                int j=ls1.get(i)-k;
                while(j<0) j++;
                while(j<n && j<=ls1.get(i)+k){
                    set.add(j);
                    j++;
                }
        }
        List<Integer> ls=new ArrayList<>();
        for(int num:set){
            ls.add(num);
        }
        Collections.sort(ls);
        return ls;
    }
}