class FindSumPairs {
    int[] nums1; 
    int[] nums2; 
    HashMap<Integer,Integer> cout;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        this.cout=new HashMap<>();
        for(int num:nums2){
            cout.put(num,cout.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int val2=nums2[index];
        cout.put(val2,cout.get(val2)-1);
        nums2[index]+=val;
        cout.put(nums2[index],cout.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int sum=0;
        for(int num:nums1){
            int tar=tot-num;
            sum+=cout.getOrDefault(tar,0);
        }
        return sum;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */