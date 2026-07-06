class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int num:nums1) set1.add(num);
        for(int num:nums2) set2.add(num);

        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();

        for(int num:nums2){
            if(!set1.contains(num) && set2.contains(num)){
                 ls2.add(num);
                 set2.remove(num);
            }
        }

        for(int num:nums1){
            if(!set2.contains(num) && set1.contains(num)){
                 ls1.add(num);
                 set1.remove(num);
            }
        } 

        
        List<List<Integer>> ls=new ArrayList<>();
        ls.add(ls1);
        ls.add(ls2);
        return ls;
    }
}